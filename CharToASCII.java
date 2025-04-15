import java.util.Scanner;

public class CharToASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read first character

        int asciiValue = ch; // Implicit conversion to int
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        
    }
}
