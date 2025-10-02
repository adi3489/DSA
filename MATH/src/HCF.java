import java.util.*;

public class HCF {

    public static int HCF(int a, int b){
        int min  = Math.min(a,b);
        while (min>1){
            if(a%min==0 && b%min==0){
                return min;
            }
            min--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int calHCF = HCF(a,b);
        System.out.println(calHCF);
    }
}
