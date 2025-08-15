import java.util.*;

public class countDigits {

    public int countDigits(int a) {
        int num = Math.abs(a);
        if (num == 0 || num < 10) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        countDigits obj1 = new countDigits();
        int result = obj1.countDigits(a);
        System.out.println(result);

    }
}
// time - logn
//space - 01
//int digits = (n == 0) ? 1 : (int)Math.floor(Math.log10(Math.abs(n))) + 1;  o(1)
//int digits = (int)Math.log10(n) + 1;

//Corner Cases
//
//When interviewers test such code, they’ll try edge scenarios:
//
//Single-digit numbers
//Input: 5 → Output: 1
//        (Your code handles this in the if statement.)
//
//Zero
//Input: 0 → Output: 1
//        (Your code covers this with if (num == 0).)
//
//Negative numbers ❌ (Currently not handled)
//Input: -123 → Your code returns 0 because the while (num > 0) loop never runs.
//        Fix: Take Math.abs(a) before counting.
//
//Large numbers
//Input: 987654321 → Works fine as long as it fits in int (up to 2,147,483,647).
//For bigger numbers, you’d use long.
//
//Minimum integer (-2147483648)
//This will cause a small trap: Math.abs(Integer.MIN_VALUE) still overflows in Java, so you might need to handle it separately.
//
//Possible Interview Questions
//
//Can you solve this without using a loop?
//
//Yes, using:
//
//int count = (int) Math.log10(num) + 1;
//
//
//but handle 0 separately.
//
//        What’s the time complexity and why?
//
//O(d) where d is the number of digits.
//
//Can your code handle negative numbers?
//
//Modify to take absolute value first.
//
//How would you handle counting digits of a number given as a string?
//
//Just return string.length() after removing signs.
//
//How would you do it recursively?
//
//countDigits(num/10) + 1 until num == 0.
//
//If you want, I can rewrite your method so it:
//
//Handles negative numbers
//
//Works for long inputs
//
//Covers the Integer.MIN_VALUE trap
