import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize factorial to 1
        long factorial = 1;
        
        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Display the result
        System.out.println("Factorial of " + number + " is " + factorial);
        
        // Close the scanner
        scanner.close();
    }
}
