import java.util.*;
public class palindromeNumber {

    public static void isPalindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;

        while(number!=0){
            int rev = number%10;
            reverseNumber = reverseNumber * 10+rev;
            number = number/10;
        }
if(originalNumber==reverseNumber){
    System.out.println("true");
}else{
    System.out.println("false");
}

    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");

        int number = s.nextInt();

        isPalindrome(number);

    }
}
