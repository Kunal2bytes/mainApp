package Inheritance;

// we can only extend parent class property from child class
class A3 {
//   private int no = 1; // if it is private then it will not access from child class

    // It is a single level inheritance

    int no = 1;

    void showA() {
        System.out.println("show a methods in A3 class");
    }
}

class B3 extends A3 {
    void showB() {
        System.out.println("show b methods in B3 class");

    }

}

public class MainApp1 {
    public static void main(String[] args) {
        B3 b3 = new B3();
        b3.showA();
        b3.showB();
        System.out.println(b3.no);
    }
}
