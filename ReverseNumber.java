import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversedNum = 0;

        // While loop to reverse the number
        while (num != 0) {
            // Get the last digit of the number
            int digit = num % 10;
            
            // Append the digit to the reversed number
            reversedNum = reversedNum * 10 + digit;
            
            // Remove the last digit from the original number
            num = num / 10;
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNum);
    }
}
