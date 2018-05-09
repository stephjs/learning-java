# Week 5

Write a Java program for a simple bank account.  

You shall define a Customer class. A customer has a first name, last name, and social security number. The social security number is a String variable and must comply with this format: xxx-xx-xxxx where 'x' is a digit between 0-9. If a customer is supplied an invalid ssn, a message must be printed that the SSN of the customer is invalid; however, it will create the bank account regardless.

You shall define a BankAccount class. A BankAccount has a customer, account number, and a balance.  A bank account can be opened with any amount of initial deposit.  For each bank account, a 10 digit random account number must be created.  Bank account shall define the following methods: deposit, withdraw. applyInterest, and checkBalance.

Every time there is a deposit or withdrawal, the amount and current balance should be displayed. One cannot withdraw more than the funds available in the account.

You shall define two types of bank accounts: Checking Account and Saving Account.  Each account accrues interest.  A saving account accrues 5% fixed interest and a checking account accrues 2% for any amount in excess of $10000 (For example, if there is $11000 in the checking account, the interest is only applied to $1000).

You shall define the BankMain class that defines the main method. You can use the “main” method shown below to test your application. The expected output is also provided.
 

public class BankMain {

    public static void main(String[] args) {       

        CheckingAccount acct1 = new CheckingAccount("Alin", "Parker", "123-45-6789", 1000.0f);
        CheckingAccount acct2 = new CheckingAccount("Mary", "Jones", "987-65-4321", 500.0f);
        SavingAccount acct3 = new SavingAccount("John", "Smith", "1233-45-6789", 200.0f);
        acct1.deposit(22000.00f);
        acct2.deposit(12000.00f);
        acct1.withdraw(2000.00f);
        acct2.withdraw(1000.00f);
        acct1.applyInterest();
        acct2.applyInterest();
        acct1.checkBalance();
        acct2.checkBalance();
        acct1.withdraw(30000.00f);
    }
}


=================== This is the expected output =======================

Successfully created account for Alin Parker Account Number 3364673506
Alin Parker, Balance $1000.0
Successfully created account for Mary Jones Account Number 6221275878
Mary Jones, Balance $500.0
Successfully created account for John Smith. Inavlid SSN!
Successfully created account for John Smith Account Number 7091028094
John Smith, Balance $200.0
Alin Parker deposited $22000.0. Current balance 23000.0
Mary Jones deposited $12000.0. Current balance 12500.0
Alin Parker withdrew $2000.0. Current balance 21000.0
Mary Jones withdrew $1000.0. Current balance 11500.0
Alin Parker, Balance $21220.0
Mary Jones, Balance $11530.0
Unable to withdraw 30000.0 for Alin Parker due to insufficient funds