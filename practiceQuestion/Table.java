package practiceQuestion;

import java.util.Scanner;

public class Table
{
    public static void main(String[] args) {
        System.out.print("Enter number for print there table: ");
        Scanner sc= new Scanner(System.in);
        int val= sc.nextInt();
        int table;
        for (int i =1; i<=10;i++){
            table=val*i;
            System.out.println(table);
        }
    }
}
