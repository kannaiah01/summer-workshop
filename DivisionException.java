import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();

            System.out.print("Enter second integer: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);
        } catch (Arithme   ticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Non-numeric input.");
        } finally {
            System.out.println("Done");
            sc.close();
        }
    }
}