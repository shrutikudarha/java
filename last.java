import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking name as input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking age as input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Printing the result
        System.out.println("My name is " + name + " and I am " + age + " years old.");

        scanner.close();
    }
}