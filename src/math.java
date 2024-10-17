import java.util.*;
public class math {


    public static int countDigits(int number) {
        int count = 0;

        // If number is 0, count is 1 because 0 has one digit
        if (number == 0) {

            return 1;
        }

        // Use a loop to count the digits
        while (number != 0) {
            number = number / 10;  // Remove the last digit
            count++;         // Increment the count
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner s = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Call the countDigits function and store the result
        int digitCount = countDigits(number);

        // Output the result
        System.out.println("The number of digits is: " + digitCount);
    }

    // Function to count the digits of a number

}
