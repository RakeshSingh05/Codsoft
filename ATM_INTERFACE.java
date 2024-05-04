import java.util.*;

public class ATM_INTERFACE{
    private double balance;
    Scanner sc = new Scanner(System.in);

    public ATM_INTERFACE(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void withdrawal() {
        System.out.println("Please enter your amount:");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient amount in your account.");
        } else {
            balance -= amount;
            System.out.println("Your current balance is " + balance);
        }
    }

    public void deposit() {
        System.out.println("Please enter your amount:");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else {
            balance += amount;
            System.out.println("Your current balance is: " + balance);
        }
    }

    public void exiting() {
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Pin : ");
        double pin = sc.nextDouble();
        atm_interface2 bank = new atm_interface2(10000);
        bank.mainFunction();
    }

    public void mainFunction() {
        boolean task = true;
        while (task) {
            System.out.println("Please enter your choice:");
            System.out.println("1. Check your account balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Thank you for visiting! Have a nice day.");
                    exiting();
                    task = false;
                    break;
                default:
                    System.out.println("You have entered an invalid choice. Please select properly.");
                    break;
            }
        }
    }
}
