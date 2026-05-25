// Print the fibbonacci Series upto Nth term
import java.util.Scanner;

public class Third{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibA = 0;
        int fibB = 1;
        for(int i = 0; i < n - 2; i++){ 
            if(fibA == 0 && fibB == 1){
                System.out.print(fibA +"\t"+ fibB);
                
            }

            int temp = fibA + fibB;
            System.out.print("\t"+ temp);
            fibA = fibB;
            fibB = temp;
            
        }
    }
}

// 0 1 1 2 3 5 8 13 21;

//fiba = 0
//fibb = 1
//fibb = fiba + fibb
