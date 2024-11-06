import java.sql.SQLOutput;
import java.util.Scanner;

public class greatestCommonDivisor {

    public static int GCD(int num1,int num2) {
int result = Math.min(num1,num2);
while(result>0){
    if(num1%result==0 && num2%result==0){
        break;
    }
    result--;
}

return result;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int HCF = GCD(num1,num2);
        System.out.println(HCF);
    }
}
