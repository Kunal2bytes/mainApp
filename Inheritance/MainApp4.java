package Inheritance;

class  A6 {
    void showA(){
        System.out.println("show A6 class");
    }
}

class  B6{
    void showB(){
        System.out.println("show B6 class");
    }
}
//this is wrong class me multiple inheritance java  se remove kar diya interface ke liye work karenga
//class  C6 extends  A6 B6 {
 class  C6 {
    void  showC(){
        System.out.println( "show C6 class");
    }
}

public class MainApp4 {
    public static void main(String[] args) {
 C6 c6= new C6();


    }
}
