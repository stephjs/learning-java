package Bank;
/**
 *
 * @author stephanieorpilla
 */
public class CheckingAccount extends BankAccount {
    CheckingAccount(Customer customer, float balance) {
        super(customer, balance);
    }
    CheckingAccount(String firstName, String lastName, String socialSecurityNumber, float balance) {
        super(firstName, lastName, socialSecurityNumber, balance);
    }
    
    @Override
    void applyInterest() {
        //accrues 2% for any amount in excess of $10000
        if (balance > 10000) {
            balance += (balance - 10000) * .02;
        }
    }
}
