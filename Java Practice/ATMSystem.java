import java.util.Scanner;

class ATM_Transaction {
    private double balance;

    // Constructor to initialize balance
    public ATM_Transaction(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn " + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public void checkBalance() {
        System.out.println("Your current balance is " + balance);
    }

    // Method to display the ATM menu
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 3: // Check balance
                    checkBalance();
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (choice != 4);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        // Create an instance of ATM_Transaction with an initial balance
        ATM_Transaction atm = new ATM_Transaction(5000); // Initial balance ₹5000
        atm.menu(); // Display the menu and perform transactions
    }
}
