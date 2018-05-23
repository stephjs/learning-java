package Customers;
/**
 *
 * @author stephanieorpilla
 */
public class CustomerMain {
    public static void main(String[] args) {
        Customer meow = new Customer("Stephanie", "Orpilla", "999123-45-1234");
        try {
            meow.checkSSN();
        } catch (InvalidCustomerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
