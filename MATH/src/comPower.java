import java.util.*;
public class comPower {

    public static int Power(int a, int b){
        int ans = 1;
        for(int i =1 ;i<=b;i++) ans = ans * a;
        return  ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int ans = Power(a,b);
        System.out.println(ans);
    }
}
