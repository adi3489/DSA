import java.util.*;
public class evenOdd {

    public static int evenOdd(int x){

        if(x%2==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
       int ans = evenOdd(x);
        System.out.println(ans);
    }
}
