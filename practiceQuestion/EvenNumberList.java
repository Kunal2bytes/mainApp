package practiceQuestion;

import java.util.Scanner;

public class EvenNumberList {
    public static void main(String[] args) {
        System.out.println("1 for odd number");
        System.out.println("2 for Even number");
        System.out.println("3 fot exit");
        System.out.print("Press number number: ");
        Scanner sc = new Scanner(System.in);
        int Usernum = sc.nextInt();
        if (Usernum == 3) {
            System.out.println("Exiting.........");
            return;
        }
        System.out.println("Enter a limit : ");
        int num = sc.nextInt();

        switch (Usernum) {

            case 1:
                System.out.println("Odd Number are:");
                for (int i = 1; i <= num; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("Even Number are:");
                for (int i = 1; i <= num; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;

            default:
                System.out.println("Invalid Number");
        }

    }
}
