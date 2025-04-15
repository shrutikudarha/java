import java.util.Scanner;

public class ASCIICharacter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);  // Read a single character

        // Type casting the character to its ASCII value and print it
        int asciiValue = (int) character;

        // Display the ASCII value of the entered character
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
