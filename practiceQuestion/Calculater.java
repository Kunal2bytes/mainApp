package practiceQuestion;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("1. for Addition");
        System.out.println("2. for Subtraction");
        System.out.println("3. for Multiplication");
        System.out.println("4. for Division");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Addition of " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction of " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of " + num1 * num2);
                break;
            case 4:
                System.out.println("Division of " + num1 / num2);
                break;
            default:
                System.out.println("Invalid number choose between 1 to 4");
        }
    }
}
