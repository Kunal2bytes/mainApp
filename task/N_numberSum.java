package task;

import java.util.Scanner;
public class N_numberSum {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        int result= num *(num+1);
        result =result/2;
        System.out.println(result);
    }
}
