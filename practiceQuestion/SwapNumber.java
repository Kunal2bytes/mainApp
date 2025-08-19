package practiceQuestion;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 1, b = 2;
//        int temp;
//        System.out.println("a is " +a +" b is " +b);
//
//        temp=b;
//        b=a;
//        a=temp;
        System.out.println("a is " + a + " b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is " + a + " b is " + b);


    }
}
