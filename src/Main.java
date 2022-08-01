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
        if (a > 0 && b > 0 && c > 0)
            if (a + b > c && a + c > b && b + c > a)
                System.out.printf("Triangle with sides %d, %d, %d  is possible.", a, b, c);
            else
                System.out.printf("Triangle with sides %d, %d, %d is not possible.", a, b, c);
        else
            System.out.println("Please, enter positive numbers.");
    }

}
