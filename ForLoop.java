import java.util.Scanner;
public class ForLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int len = sc.nextInt();
        int[] arr;
        arr = new int[len];
        //System.out.println("Enter the element of Array : ");
        for(int i = 0; i < len; i++){
            System.out.printf("Enter the %d element: ",i);
            arr[i] = sc.nextInt();
        }
    }
}