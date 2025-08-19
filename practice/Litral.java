package practice;

// int and binary
public class Litral {
    public static  void main (String[] args ){
        int n1=12121;
        System.out.println(n1);
        // I want when I type binary value then show normal value like
        int n2=0b11001; // when I add 0b/0B before thet value then its show exact value means ye 25 ka binary hai
        System.out.println(n2);

        //for octal to normal
        int n3=031; // octal ke liye 0 add kare op 25
        System.out.println(n3);

        // hexa sse normal
        int n4=0x19; // hexa ke liye 0x add kare op 25
        System.out.println(n3);


    }
}
