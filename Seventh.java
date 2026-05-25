//CHeck Number , it is Prime or not;

import java.util.Scanner;

public class Seventh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int checkPrime = 0;
        for(int i = 2; i < n/2 + 1; i++){
            if(n % i == 0){
                checkPrime = 1;
                break;
            }
        }
        if(checkPrime == 1 || n == 1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}