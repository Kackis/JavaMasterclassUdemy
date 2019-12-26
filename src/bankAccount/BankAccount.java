package bankAccount;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount (){ //is empty
        System.out.println("Empty constructor parameter.");
    }
    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber ){
        System.out.println("Account constructor with parameter called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmounth){
        this.balance = balance + depositAmounth;
        System.out.println("Deposit of " + depositAmounth + "New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmounth){
        if(this.balance - withdrawalAmounth <=0){
            System.out.println("Only " + this.balance + "available. Withdrawal not processed.");
        } else {
            this.balance = balance - withdrawalAmounth;
            System.out.println("Withdrawal of " + withdrawalAmounth + "processed. Remaining balance = " + this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String accountNumber) {
        this.number = accountNumber;
    }
}
