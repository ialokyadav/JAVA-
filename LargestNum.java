
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



public class LargestNum{
    public void descendingOrder(int[] num){
        String[] str = new String[num.length];
        for(int i = 0; i < num.length; i++){
            str[i] = String.valueOf(num[i]);
        }
        Arrays.sort(str);
        System.out.println(str);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte len = sc.nextByte();
        int[] num = new int[len];
        for(int i = 0; i < len; i++){ 
            num[i] = sc.nextInt();
        }
        LargestNum sorts = new LargestNum();
        sorts.descendingOrder(num);
    }
}