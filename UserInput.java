import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=  sc.next();

        System.out.print("Enter your rollno: ");
        int rollNo=sc.nextInt();

        System.out.print("Enter your Marks: ");
        float marks=sc.nextFloat();

        System.out.println("Hello! "+name + " your rollNumber is "+ rollNo+ " and your marks are "+ marks );

    }
}
