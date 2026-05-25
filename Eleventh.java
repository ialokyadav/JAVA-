//Check weather it is armstrong or not;
//Armstrong number means the number is equal to sum of toataldigt power of digit;
// 153 = 1^3 + 5^3 + 3^3
//       1 + 125 + 27 = 153
import java.util.Scanner;

public class Eleventh{
    static int powerCalculate(int number , int power){
        int result = 1;
        while(power > 0){
            result *= number;
            power --;
        }
        return result;
    }

    static int digitsCount(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count ++;
        }
        return count;
    }

    static int sumOfDigit(int number){
        int count = digitsCount(number);
        int sum = 0;
        //int temp = number;
        for(int i = 0; i < count; i++){
            int digit = number % 10;
            sum += powerCalculate(digit, count);
            number /= 10;
        }
        return sum;
    }

    static int isArmstrong(int number){
        if(number == sumOfDigit(number)){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n) == 1){
            System.out.println("It is Armstrong number");
        }else{
            System.out.println("It is not Armstrong number");
        }
        
    }
}