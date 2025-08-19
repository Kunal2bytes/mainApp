package methosPractice;

public class UsingVariable {
    int no_of_eyes;
    String color;
    public void  details(String name){
        System.out.println("------------ details of " + name + "--------------------" );
        System.out.println( " Eyes  :" + no_of_eyes);
        System.out.println( " Color :" + color);
    }

    public static void main(String[] args) {
    UsingVariable jambo= new UsingVariable();
    jambo.no_of_eyes=2;
    jambo.color="black";
    jambo.details("jambo");

UsingVariable buzo = new UsingVariable();
buzo.color="green";
buzo.no_of_eyes=3;
buzo.details("buzo");
    }

}
