import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class Account {
    private String accountHolder;
    private double balance;
    private List<String> transactions;

    public Account(String name, double initialBalance)
    {
        accountHolder = name;
        balance = initialBalance;
        transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
            System.out.println("Deposit successful!");
        } else
        {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance)
            {
                balance -= amount;
                transactions.add("Withdrawn: " + amount);
                System.out.println("Withdrawal successful!");
            }
            else {
                System.out.println("Insufficient balance!");
            }
        }
        else {
            System.out.println("Invalid amount!");
        }
    }

    public void showBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactions() {
        System.out.println("\n Transaction History ");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
public class bankapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(name, balance);

        int choice = 0;

        while (choice != 5)
        {
            System.out.println("\nBANK MENU");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter amount: ");
                acc.deposit(sc.nextDouble());

            }
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                acc.withdraw(sc.nextDouble());

            }
            else if (choice == 3) {
                acc.showBalance();

            }
            else if (choice == 4) {
                acc.showTransactions();

            }
            else if (choice == 5) {
                System.out.println("Thank you!");

            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }

}

