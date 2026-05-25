//Sum of digits of Number

import java.util.Scanner;

public class Forteenth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of digit of Number "+n+ " : "+sum);
    }
}