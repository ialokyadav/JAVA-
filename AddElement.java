
import java.util.Scanner;

public class AddElement{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();

        //int[] arr = new int[len];
        int[] arr = new int[len];


        for(int i = 0; i < len; i++){
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < len; i++){ 
            sum += arr[i];
        }
        float avg = (float)sum / len;

        System.out.println(sum + " is sum of element inside array");

        System.out.println(avg + " is average of element inside array");
    }

}