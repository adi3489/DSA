import java.util.*;

public class lcm {

    public  static int LCM(int x, int y){
        int max  = Math.max(x,y);
     while(true){
         if(max%x==0 && max%y==0){
             return max;
         }
         max++;
     }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a  = s.nextInt();
        int b = s.nextInt();
        int CalculateLCM = LCM(a,b);
        System.out.println(CalculateLCM);
    }
}
