package practiceQuestion;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int val=1;
        for (int i=num; i>0; i-- ){
            val=val*i;
            System.out.println(val);

        }
        System.out.println(val);

    }
}
