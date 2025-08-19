package Inheritance;

class  A4 {
 void showA(){
     System.out.println("showA method in A4");
    }
}
class  B4 extends  A4{
    void showB(){
        System.out.println("showB method in B4");
    }
}
class  C4 extends B4 {
    void showC(){
        System.out.println("showC method in C4");
    }
}
 // multiple inheritance are used like A4's methods will access B4 and A4's and B4's methods will access in C4.
public class MainApp2 {

    C4 c4= new C4();
    A4 a4 = new A4();
    B4 b4 = new B4();


}
