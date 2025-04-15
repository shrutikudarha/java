import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: N
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Output: 1 2 3 ... N
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
