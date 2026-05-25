
import java.util.Scanner;

public class Palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num = number;
        int reversedNum = 0;
        while(num > 0){
            int temp = num % 10;
            reversedNum = 10 * reversedNum + temp;
            num /= 10;
        }
        if(number == reversedNum){
            System.out.println( number + " Numbeer is palindrom");
        }
        else{
            System.out.println("Number is not palindrom");
        }
    }
}
//123321