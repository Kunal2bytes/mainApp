package methosPractice;

// its a Right way  to writing a code increass readebility
class Animal2 {
    public void eat(String name) {
        System.out.println(name + " is Eating");
    }
}

class bird {
    public void fly(String name) {
        System.out.println(name + " is Flying");
    }
}

public class WriteWayForMain {
    public static void main(String[] args) {
        Animal2 buzo = new Animal2();
        buzo.eat("buzo");
       bird pp= new bird();
       pp.fly("pp");
    }
}
