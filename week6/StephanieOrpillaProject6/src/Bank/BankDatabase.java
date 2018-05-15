package Bank;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author stephanieorpilla
 */
public class BankDatabase {
    BankDatabase() {}
    ArrayList<BankAccount> allAccounts = new ArrayList();
    void createCheckingAccount(String customerName, String ssn, float deposit) {
        String firstName = splitString(customerName)[0];
        String lastName = splitString(customerName)[1];
        CheckingAccount currAccount = new CheckingAccount(firstName, lastName, ssn, deposit);
        allAccounts.add(currAccount);
    }
    void createSavingAccount(String customerName, String ssn, float deposit) {
        String firstName = splitString(customerName)[0];
        String lastName = splitString(customerName)[1];
        SavingAccount currAccount = new SavingAccount(firstName, lastName, ssn, deposit);
        allAccounts.add(currAccount);
    }
    void print() {
        Collections.sort(allAccounts);
        for (int i=0; i<allAccounts.size(); i++) {
            allAccounts.get(i).checkBalance();
        }
    }
    void applyInterest() {
        for (int i=0; i<allAccounts.size(); i++) {
            allAccounts.get(i).applyInterest();
        }
    }
    private String[] splitString(String fullname) {
        return fullname.split("\\s+");
    }

}
