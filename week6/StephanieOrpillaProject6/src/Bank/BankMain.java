package Bank;
/**
 *
 * @author stephanieorpilla
 */
public class BankMain {
    public static void main(String[] args) {
        BankDatabase acctDatabase = new BankDatabase();

      acctDatabase.createCheckingAccount("Alin Parker", "123-45-6789", 20000.0f);

      acctDatabase.createSavingAccount("Mary Jones", "987-65-4321", 15000.0f);

      acctDatabase.createSavingAccount("John Smith", "123-45-6789", 12000.0f);

      acctDatabase.print();

      acctDatabase.applyInterest();

      acctDatabase.print();
    }
}