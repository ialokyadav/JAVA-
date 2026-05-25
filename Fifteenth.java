//calculate the power of Number

import java.util.Scanner;

public class Fifteenth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int temp = pow;
        int result = 1;
        if(pow == 0){
            result = 1;
        }
        while(temp > 0){
            result *= num;
            temp --;
        }
        System.out.println(pow + " power of " + num + " : " +result);
    }
}