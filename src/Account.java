public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("2345", 123.45, "Fan", "fan@123.com", "456");
        System.out.println("Empty Constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("999", 100, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your balance is $" + this.balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("You don't have enough money");
        } else {
            this.balance -= amount;
            System.out.println("Your balance is $" + this.balance);
        }
    }
}
