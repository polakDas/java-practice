import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // static values for a, b, c
        // int a = 10;
        // int a = 40;
        // int b = 20;
        // // int c = 30;
        // int c = 15;

        try (// let's take input from user
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();

            System.out.println("Enter second number: ");
            int b = scanner.nextInt();

            System.out.println("Enter third number: ");
            int c = scanner.nextInt();

            int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

            // Long form of this statement
            // int result;
            // if (a > b) {
            // if (a > c) {
            // result = a;
            // } else {
            // result = c;
            // }
            // } else if (b > c) {
            // result = b;
            // } else {
            // result = c;
            // }

            System.out.println("Largest number is: " + result);
        }
    }
}
