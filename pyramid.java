public class pyramid {
    public static void main(String[] args) {
        int rows = 5; // number of pyramid levels

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }
    }
}
