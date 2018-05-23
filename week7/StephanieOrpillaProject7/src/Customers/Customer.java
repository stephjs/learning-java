package Customers;
/**
 *
 * @author stephanieorpilla
 */

public class Customer {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    
    Customer(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    void checkSSN() throws InvalidCustomerException {
        if (!validateSSN(socialSecurityNumber)) {
            InvalidCustomerException err = new InvalidCustomerException(socialSecurityNumber);
            throw err;
        }
        System.out.println("Customer: "+firstName+" "+lastName+" SSN:"+socialSecurityNumber);
    }
    private boolean validateSSN(String ssn) {
        if (!ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            return false;
        } else {
            return true;
        }
    }
}