import java.util.Scanner;

public class primeNumber {

    public static boolean checkPrime(int a ) {
        if (a <= 1) return false;
        boolean isprime = true;

        for (int i = 2; i <= a / 2; i++) {

            if (a % i == 0) {
                isprime=false;
            }
        }
        return isprime;
    }




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(checkPrime(a));
    }
}
