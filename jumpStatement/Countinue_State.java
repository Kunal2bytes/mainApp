package jumpStatement;

public class Countinue_State {
   // continue will skip the current statement which match the condition
    public static void main(String[] args) {
        for (int i=1; i<=5;i++ ){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
