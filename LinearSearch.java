
import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of Arr : ");
        len = sc.nextInt();

        int[] a ;
        a = new int[len];

        System.out.println("Enter element of arr : ");
        for(int i = 0; i < len; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search ");
        int key = sc.nextInt();

        int found = -1;
        for(int i = 0; i < len; i++){
            if(a[i] == key){
                found = i;
            }
        }

        if(found != -1){
            System.out.println("found at " +found + " index ");
        }else{
            System.out.println("Not Found");
        }

    }
}