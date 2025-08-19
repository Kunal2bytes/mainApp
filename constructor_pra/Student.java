package constructor_pra;

public class Student {
    String name;
    int rollNo;
    public  Student(int rn, String n ) {
        this.rollNo =rn;
        this.name= n;
    }

    public static void main(String[] args) {
        Student std1= new Student(122,"kunal");
        System.out.println(std1.name + " : " + std1.rollNo);
     Student std2= new Student(123, "Uday");
        System.out.println(std2.name + " : " + std2.rollNo);

    }

}
