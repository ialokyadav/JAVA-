
import java.util.Scanner;
class Stack_List{
    int top = -1;
    int[] arr = new int[100];
    
    void push(int data){

    }

    public int isEmpty(){
        if(top == -1)
            return 1;
        
        return 0;
    }

    public int isFull(){
        if(top == 100-1){
            return 1;
        }
        return 0;
    }
}

//public class Stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much element you want to push : ");
        int len = sc.nextInt();


    }
//}