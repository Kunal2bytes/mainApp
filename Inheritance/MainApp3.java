package Inheritance;

 class  A5 {
     void ShowA(){
         System.out.println("ShowA method in class ");
     }
 }
 class  B5 extends  A5{
     void  ShowB(){
         System.out.println("ShowB");
     }
 }
 class  C5 extends  A5{
     void  showC(){
         System.out.println("ShowC");
     }
 }

 //hierarchical Inheritance :- parent class ki property do different  class access kar saktey hai
//here  a is parent class and c and  b are inherit their properties.
public class MainApp3 {
    public static void main(String[] args) {
        A5 a5= new A5();
        B5 b5=new B5();
        b5.ShowB();
        b5.ShowA();
        C5 c5= new C5();
    c5.showC();
    c5.ShowA();
    }
}
