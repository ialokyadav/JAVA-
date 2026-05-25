//Print the prime number upto N;
import java.util.Scanner;

public class Eighth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i <= n + 1; i ++){
            boolean isPrime = true;
            for(int j = 2; j < i/2 + 1; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.print(i +"\t");
            }
        }
    }
}