import java.util.*;

public class greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("10: ");
        double num1 = scanner.nextDouble();

        System.out.print("20");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}