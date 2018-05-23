package Customers;
/**
 *
 * @author stephanieorpilla
 */
public class InvalidCustomerException extends Exception {
    String socialSecurityNumber;
    
    InvalidCustomerException(String socialSecurityNumber) {
        super();
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String getMessage() {
        return "The social security number '"+ socialSecurityNumber + "' is invalid. Please comply with this format: xxx-xx-xxxx.";
    }
}