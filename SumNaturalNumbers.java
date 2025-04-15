import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get N from the user
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // While loop to calculate sum
        while (i <= N) {
            sum += i;
            i++;
        }

        // Output: Display the result
        System.out.println("Sum of first " + N + " natural numbers is: " + sum);

        scanner.close();
    }
}

