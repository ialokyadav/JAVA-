
import java.util.Scanner;

public class _7th{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float phy = sc.nextFloat();
        float che = sc.nextFloat();
        float math = sc.nextFloat();
        float bio = sc.nextFloat();
        float cs = sc.nextFloat();
        float totalMarks = phy + che + math + bio + cs;
        float percentage = (totalMarks/500) * 100;
        if(percentage >= 90){
            System.out.println("Grade A");
        }else if(percentage >= 80){
            System.out.println("Grade B");
        }else if(percentage >= 70){
            System.out.println("Grade C");
        }else if(percentage >= 60){
            System.out.println("Grade D");
        }else if(percentage >= 40){
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
    }
}