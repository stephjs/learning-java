package Bank;
/**
 *
 * @author stephanieorpilla
 */
public class SavingAccount extends BankAccount {
    SavingAccount(Customer customer, float balance) {
        super(customer, balance);
    }
    SavingAccount(String firstName, String lastName, String socialSecurityNumber, float balance) {
        super(firstName, lastName, socialSecurityNumber, balance);
    }
    
    @Override
    void applyInterest() {
        // accrues 5% fixed interest
        balance += balance * .05;
    }
}