
import java.util.Scanner;

public class _2nd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char c = Character.toLowerCase(a);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("Charecter is vowel");
        }else{
            System.out.println("Charecter is constant");
        }

    }
}