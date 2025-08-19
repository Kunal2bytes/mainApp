package constructor_pra;
// mene no. ko koi value provide nahi ki hai fr bhi
// out me 0 aa raha hai kyoki compiler bydefault ek constructor
//create karta hai aur int ke liye value 0 and string ke liye null deta  hai
public class Test {
    int no;

    public static void main(String[] args) {
        Test obj= new Test();
        System.out.println(obj.no);
    }
}
