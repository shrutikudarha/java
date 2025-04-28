
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
      String palindrome="racecarjhdgahaha";
        int count =0;
        char[] arr = str.tocharArray();
        for(int i =0;i<arr.length;i++){
            switch(arr[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':  
                     count++;
                     break;


            }
        }
    System.out.println("vowel count is" + count);
    }
}