package CustomerApp.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public Iterable<Customer> retrieveAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer retrieveCustomer(@PathVariable int id) {
        Optional<Customer> product = customerRepository.findById(id);

        if (!product.isPresent())
            throw new CustomerNotFoundException("id-" + id);

        return product.get();
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerRepository.deleteById(id);
    }

    @PostMapping("/customers")
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerRepository.save(customer);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedCustomer.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
    @PutMapping("/customers/{id}")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer, @PathVariable int id){
        Optional<Customer> customerOptional= customerRepository.findById(id);

        if (!customerOptional.isPresent())
            return ResponseEntity.notFound().build();

        customer.setId(id);

        customerRepository.save(customer);

        return ResponseEntity.noContent().build();
    }
}
