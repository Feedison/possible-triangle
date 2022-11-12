// Importing scanner library
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Announcing scanner
        Scanner console = new Scanner(System.in);

        // Type from keyboard
        System.out.print("Enter size of the first side: ");
        int a = console.nextInt();
        System.out.print("Enter size of the second side: ");
        int b = console.nextInt();
        System.out.print("Enter size of the third side: ");
        int c = console.nextInt();

        /* Checking theorem:
        "The sum of two lengths of the sides of a triangle always greater than the length of the third side."
        */
        String res = isTrianglePossible(a, b, c);
        System.out.println(res);
    }

    // Check method
    static String isTrianglePossible(int a, int b, int c) {
        if ((a > 0) && (b > 0) && (c > 0)) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                return "Triangle with sides " + a + ", " + b + ", " + c + " is possible";
            } else {
                return "Triangle with sides " + a + ", " + b + ", " + c + " is not possible";
            }
        } else {
            return "Enter only positive numbers.";
        }
    }
}
