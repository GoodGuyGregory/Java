/**
 *
 * @author gawitt
 */
public class Account {

    ////// Attributes
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;
    private int transactions;
    private static int numberOfAccounts; // Static class variable

    Account() {
        id = 0;
        name = "default";
        balance = 0;
        annualInterestRate = 0;
        numberOfAccounts = 1;
        transactions = 0;

    }// Default no Argument Constructor

    Account(int i, String n, double b, double aIR) {
        id = i;
        name = n;
        balance = b;
        annualInterestRate = aIR;

    }// Account Constructor

    //////// Accessors
    public int getid() {
        return id;
    }// getid

    public String getname() {
        return name;
    }// getname

    public double getbalance() {
        return balance;
    }// getbalance

    public double getannualInterestRate() {
        return annualInterestRate;
    }// annualInterestRate

    public String getdateCreated() {
        return dateCreated;
    }// dateCreated

    public int gettransactions() {
        return transactions;
    }// get transactions

    public int getnumberOfAccounts() {
        return numberOfAccounts;
    }// getnumberOfAccounts

    //////// Mutators
    public void setid(int newid) {
        id = newid;
    }// setid

    public void setname(String newName) {
        name = newName;
    }// setName

    public void setbalance(double newbalance) {
        balance = newbalance;
    }// setBalance

    public void setannualInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate;
    }// setannualInterestRate

    //////// Methods
    public void withdraw(double amount) {
        balance -= amount; // subtracting amount from account
        System.out.println("Withdrawn: " + amount); // Echo
        System.out.println("Current Balance: " + balance); // Echo
        transactions++;// Accumulator for transactions
    }// withdraw

    public void deposit(double depositAmount) {
        balance += depositAmount; // adding a new amount to the account balance
        System.out.println("You have deposited: " + depositAmount); // Echo
        System.out.println("New Balance: " + balance); // Echo
        transactions++; // Accumulator for transactions
    }// deposit

    public void transferFunds(Account transferAccount, double transferAmount) { // calling the transfer account as an
                                                                                // object which will be transfered with
                                                                                // the object data type
        transferAccount.withdraw(transferAmount); // Transfering from the selected account
        deposit(transferAmount);// depositing into the calling object which called the transferFunds

    }// transferFunds

    public void displayAccount() {
        System.out.println("===================================================================");
        System.out.println("                        Acount: " + id); // displays the id number of the account
        System.out.println("===================================================================");
        System.out.println("                  Account Name: " + name); // displays the name of the account
        System.out.println("          Date Account Created: " + dateCreated); // displays date created
        System.out.println("     Number of Active Accounts: " + numberOfAccounts); // displays the number of opened
                                                                                   // accounts
        System.out.println("Account Interest Rate (Annual): " + annualInterestRate); // displays the annual interest
                                                                                     // rate
        System.out.println("               Account Balance: " + balance); // displays the balance
        System.out.println("                  Transactions:" + transactions); // Displays number of Transactions in the
                                                                              // account
        System.out.println("===================================================================");// fancy high-tech
                                                                                                  // closing border
    }// displayAccount

}// AccountObject
