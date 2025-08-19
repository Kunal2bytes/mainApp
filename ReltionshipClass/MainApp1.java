package ReltionshipClass;

import java.util.ArrayDeque;

class Address {
    String city = "Indore";
    String state = "MP";

    void addressStd() {
        System.out.println("city : " +city + " (Mp) " +state );
    }

}

class Student {
    int rollNo;
    String name;
    Address obj = new Address();

      Student(int rn, String n){
        rollNo=rn;
        name=n;
    }

    void studentDetail() {
        System.out.println("name is : " + name + " rollNo  is : " + rollNo);
     obj.addressStd();

    }

}

public class MainApp1 {
    public static void main(String[] args) {
      Student std= new Student(122,"kunal" );
      std.studentDetail();
    }
}
