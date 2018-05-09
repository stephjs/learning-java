package Bank;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author stephanieorpilla
 */
public class BankAccount {
    Customer customer;
    String accountNumber = getNewAccountNum();
    float balance;
    
    BankAccount(Customer customer, float balance) {
        this.customer = customer;
        this.balance = balance;
        successMessage();
    }
    
    BankAccount(String firstName, String lastName, String socialSecurityNumber, float balance) {
        this.customer = new Customer(firstName, lastName, socialSecurityNumber);
        this.balance = balance;
        successMessage();
        checkBalance();
    }
    
    private void successMessage() {
        if (!customer.validSSN) {
            System.out.println("Successfully created account for "+customer.firstName+" "+customer.lastName+". Inavlid SSN!");
        }
        System.out.println("Successfully created account for "+customer.firstName+" "+customer.lastName+" Account Number "+accountNumber);
    }
    
    private String getNewAccountNum() {
        String accountNum = "";
        for (int i=0; i<10; i++) {
            int min;
            if (i==0) {
                min = 1; 
            } else {
                min = 0;
            }
            accountNum += ThreadLocalRandom.current().nextInt(min, 10);
        }
        return accountNum;
    }   
    
    void deposit(float depositAmt) {
        balance += depositAmt;
        System.out.println(customer.firstName+" "+customer.lastName+" deposited $"+depositAmt+". Current balance "+balance);
    }
    
    void withdraw(float withdrawAmt) {
        if (withdrawAmt > balance) {
            System.out.println("Unable to withdraw "+withdrawAmt+" for "+customer.firstName+" "+customer.lastName+" due to insufficient funds");
        } else {
            balance -= withdrawAmt;
            System.out.println(customer.firstName+" "+customer.lastName+" withdrew $"+withdrawAmt+". Current balance "+balance);
        }
    }
    
    void applyInterest() {
        int interestPercent = 0;
        balance = balance + balance * interestPercent;
    }
    
    void checkBalance() {
        System.out.println(customer.firstName+" "+customer.lastName+", Balance $"+balance);
    }
}
