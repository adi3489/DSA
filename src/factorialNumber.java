import java.util.*;
public class factorialNumber {
    public static int factorial(int number) {
        int fact = 1;
        for(int i=number;i>=1;i--){
            fact = fact*i;
        }
        return fact;
    }
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();

       int fact =  factorial(number);
       System.out.println(fact);
    }
}
