
import java.util.Scanner;

public class _3rd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println("It is upper case");
        }else{
            System.out.println("it is lower case");
        }
    }
}