package methosPractice;

public class Animal {
    public  void  run(){
        System.out.println("Animal run ");
    }
    public  void  eat(){
        System.out.println("Animal Eating ");
    }


    public static void main(String[] args) {
      //Note:- output will print according main method sequence top to bottom

        System.out.println("1");
        Animal jambo= new Animal();
        Animal buzo = new Animal(); // multiple object also created
        buzo.run();
        buzo.eat();
        jambo.run();
        jambo.eat(); // we can write  multiple method in a class and access them creating object, object can be one or
        // more than one using one we can access or creating multiple we can access.

        Vehical car= new Vehical();
        car.run();

    }
}
 class Vehical {
    public  void  run (){
        System.out.println("Is running");
    }// if class is saprate then object also be sapreate but main class is one in project

 }

