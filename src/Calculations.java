import java.util.Scanner;

public class Calculations {

    public static void calculations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers (0-100):");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Can't divide by 0!");
        } else {
        int remainder = dividend % divisor;
            System.out.println("Remainder of division is: " + remainder);
        }
    }
}
