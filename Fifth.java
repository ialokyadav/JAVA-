
import java.util.Scanner;

//count the vowel in sentence ;

public class Fifth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        int vowel = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                vowel++;
            }
        }
        System.out.println(vowel);

    }
}