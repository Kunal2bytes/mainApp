package task;

import java.util.Scanner;

public class BankTask {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name);
        double balance = 0;
        int choice;
        while (true) {
            System.out.println("Select one option from below : ");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Withdraw Money ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your bank balance is " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Your bank balance is " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Enter withdraw amount");
                    double withdraw = sc.nextDouble();
                    if (balance <= 0) {
                        System.out.println("Insufficiant balance");
                    } else if (balance < withdraw) {
                        System.out.println("Insufficiant balance");

                    } else {
                        if (withdraw > 0) {
                            balance = balance - withdraw;
                            System.out.println("Your bank balance is " + balance);

                        }

                    }

                    break;
                case 4:
                    System.out.println("Thank you for using our banking service.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");

            }
            System.out.println("------------------------");

        }

    }
}
