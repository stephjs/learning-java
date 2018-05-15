package Bank;
/**
 *
 * @author stephanieorpilla
 */
public class Customer {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    public boolean validSSN;
    
    Customer(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = validateSSN(socialSecurityNumber);
    }
    
    private String validateSSN(String ssn) {
        if (!ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            //System.out.println("The social security number '"+ ssn + "' is invalid. Please comply with this format: xxx-xx-xxxx.");
            validSSN = false;
        } else {
            validSSN = true;
        }
        return ssn;
    }
}
