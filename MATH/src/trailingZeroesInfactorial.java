import java.util.*;

public class trailingZeroesInfactorial {

    public  static int factorial(int a ){
        int fact = 1;
        for(int i = 1;i<=a;i++){
            fact=fact*i;
        }
        int count=0;
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int zero = factorial(a);
        System.out.println(zero);
    }
}
