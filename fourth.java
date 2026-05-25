// Factorial of number N;

import java.util.Scanner;

public class fourth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;
        if(n == 0 || n == 1){
            factorial = 1;
        }
        while(n > 0){ 
            factorial = factorial * n;
            n--;
        }
        System.out.println(factorial);
    }
}