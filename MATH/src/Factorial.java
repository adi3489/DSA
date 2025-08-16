
import java.util.*;
public class Factorial {

    public static int Factorial(int num ){

        if(num==0 || num==1){
            return 1;
        }
        int result = 1;
        for(int i =1;i<=num;i++){
            result = result*i;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a  = s.nextInt();
        System.out.println(Factorial(a));
    }
}
