package practiceQuestion;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a Valid 4 digit number ...");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1000 && year <= 9999) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " Not a leap year");
            }
        } else {
            System.out.println(" not a Valid 4 digit number ...");
        }
    }
}
