import java.util.Scanner;
public class ATM {
    static int balance = 10000;
    static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
    static void withdraw(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Please enter valid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful");
        }
    }
    static void deposit(int amount) {
        if (amount % 100 == 0 && amount < 40000) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Please enter valid amount");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 4 digit pin: ");
        String pin = sc.next();
        if (!pin.equals("2612")) {
            System.out.println("Access Denied! Incorrect PIN");
            return;
        }
        System.out.println("Welcome");
        int choice;
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    int withdraw = sc.nextInt();
                    withdraw(withdraw);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();
                    deposit(deposit);
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 4);
        sc.close();
    }
}