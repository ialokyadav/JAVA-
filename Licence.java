
import java.util.Scanner;


public class Licence{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("What is your age : ");
       int a = sc.nextInt();

       boolean hasLicence = (a > 18);
       
       if(!hasLicence){
            System.out.println("He can not  Drive");
       }else{
        System.out.println("He can Drive");
       }
   }
}