import java.util.Scanner;

public class Calculations {
    public static void calculations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers (0-100):");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b==0) {
            System.out.println("Can't divide by 0!");
        } else {
        int c = a % b;
            System.out.println("Remainder of division is: " + c);
        }


    }
}
