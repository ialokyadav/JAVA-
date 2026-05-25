//Reverse the Number;
import java.util.Scanner;

public class Twelveth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp > 0) { 
            int digit;
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse of " + n +" : " +reverse );
    }
}