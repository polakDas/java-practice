import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number to generate factorially");
            int num = scanner.nextInt();

            int result = 1;

            // for loop
            // for (int i = 1; i <= num; i++) {
            // result *= i;
            // }

            /*
             * Java has a foreach loop like php. unlike php, the syntax is like
             * for(datatype variable : iterable object) {}
             * I can't demonstrate this foreach loop here because I don't have any iterable
             * object
             */

            // while loop
            // int index = 1;
            // while (index <= num) {
            // result *= index;
            // index++;
            // }

            // do-while loop
            int index = 1;
            do { // this block will run at least once. After that it check the condition
                result *= index;
                index++;
            } while (index <= num);

            // continue and break - behaves as usual.

            System.out.println("The result is " + result);
        }
    }
}
