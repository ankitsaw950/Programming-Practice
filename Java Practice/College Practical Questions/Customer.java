class Bank {
    String accountNumber;
    double balance;
    String customerName;

    public Bank(String accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    

    public void deposit(double amount) {
        System.out.println();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount is successfully added");
            System.out.println("Deposited Amount : " + amount);
        } else {
            System.out.println("Enter valid amount");
        }
    }
    
    public void withdraw(double amount) {
        System.out.println();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount is successfully withdrawn");
            System.out.println("Withdrawn Amount : " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Customer name :" + customerName);
        System.out.println("Account number :" + accountNumber);
        System.out.println("Balance :" + balance);
    }

}

class SavingsAccount extends Bank {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, String customerName, double interestRate) {
        super(accountNumber, balance, customerName);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println();
        System.out.println("Interest earned : " + interest);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println();
        System.out.println("Account Type : Savings");
        System.out.println("Interest rate :" + interestRate + " %");
    }
}

class CheckingAccount extends Bank {
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String customerName, double overdraftLimit) {
        super(accountNumber, balance, customerName);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println();
            System.out.println("Withdrawl Succesful");
            System.out.println("Amount withdrawn: " + amount);
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println();
        System.out.println("Account type : Checking");
        System.out.println("Overdraft limit:" + overdraftLimit);
    }
}

public class Customer {
    public static void main(String[] args) {
        SavingsAccount p1 = new SavingsAccount("S1234",2000.0,"Ankit",1.5);
        p1.displayInfo();
        p1.deposit(500);
        p1.calculateInterest();
        p1.withdraw(200);
        p1.displayInfo();
        
        CheckingAccount p2 = new CheckingAccount("C5678",1000.0,"Suresh",500);
        p2.displayInfo();
        p2.withdraw(200);
        p2.deposit(500);
        p2.displayInfo();
        
    }
}
