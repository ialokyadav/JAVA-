
import java.util.Scanner;

//without recursion 

/*

public class BinarySearch{
    public static void main(String[] args) {
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

        int low = 0;
        int high = len - 1;
        int found = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(a[mid] == key){
                found = mid;
                break;
            }else if(a[mid] > key){
                high = mid - 1;
            }else if(a[mid] < key){
                low = mid + 1;
            }
        }

        if(found == -1){
            System.out.println("Element not Found");
        }else{
            System.out.println("Element found at "+found+"th index.");
        }
        sc.close();
    }
}

*/

//with recursion 

public class BinarySearch{

    static int binarySearch(int[] a , int low , int high , int key){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(a[mid] == key){
            return mid;
        }else if(a[mid] > key){
            return binarySearch(a, low, mid - 1, key);
        }else{
            return binarySearch(a, mid + 1, high, key);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr : ");
        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.println("Eneter the element of array : ");
        for(int i = 0; i < len; i++){ 
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element for search :");
        int key = sc.nextInt();
        int found = binarySearch(a , 0 , len - 1 , key);
        if(found != -1){
            System.out.println("Element found at " +found+ "at index");
        }else{
            System.out.println("Not found");
        }
    }
}