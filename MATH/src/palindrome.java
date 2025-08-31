import java.util.*;


public class palindrome {

   public  static int  palindrome(int a ){
       int real = a;
       int duplicate = a;
       int ans = 0;
       while(duplicate>0){
           int rem = duplicate%10;
           ans = (ans * 10) + rem;
           duplicate = duplicate/10;
       }
       return ans;
   }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
       int x =  palindrome(a);
        if(x==a){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
