package SpringApp.Product;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String exception){
        super(exception);
    }
}
