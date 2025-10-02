import java.util.*;

public class PrimeFactors {

    public static boolean isprime(int i) {
        if (i <= 1) return false;
        if (i == 2) return true;
        for (int a = 2; a * a <= i; a++) {
            if (i % a == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        for (int i = 2; i < y; i++) {
            if (isprime(i)) {
                int x = i;
                while (y % x == 0) {
                    System.out.println(i);
                    x = x * i;
                }
            }
        }
    }
}

