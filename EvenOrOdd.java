
import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.printf("The value %d is even ", a);
        }else{
            System.out.printf("The value %d is odd ", a);
        }
    }
}