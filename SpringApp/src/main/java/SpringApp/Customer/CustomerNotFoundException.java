package SpringApp.Customer;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(String exception){
        super(exception);
    }
}
