
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 7 && a > 0){
            switch (a){
                case 1 : System.out.println("Monday");
                    break;
                case 2 : System.out.println("Tuesday");
                    break;
                case 3 : System.out.println("Wednesday");
                    break;
                case 4 : System.out.println("Thrusday");
                    break;
                case 5 : System.out.println("Friday");
                    break;
                case 6 : System.out.println("saturday");
                    break;
                default : System.out.println("Sunday");

            }
        }else{
            System.out.println("Invalid Input! Please inter the value 1 to 7");
        }

    }
}