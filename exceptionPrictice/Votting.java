package exceptionPrictice;

import java.util.Scanner;

class youngerException extends  RuntimeException{
    youngerException (String msg) {
        super(msg);
    }
}

public class Votting {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
   try{
       if (age<18){
           throw  new youngerException("your are not eligible for voting");

       }
       else{
           System.out.println("Please vote");

       }

   }
   catch (Exception e){
//       System.out.println(e);
  e.printStackTrace();
   }
    }
}
