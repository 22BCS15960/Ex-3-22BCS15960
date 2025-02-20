import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
            }
            System.out.println("Square root: " + Math.sqrt(number));
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
