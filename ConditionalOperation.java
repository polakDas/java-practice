import java.util.Scanner;

public class ConditionalOperation {
    public static void main(String[] args) {
        // create a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check leap or not");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        switch (year) {
            case 1990:
                System.out.println("The year is " + year);
                break;
            case 2000:
                System.out.println("The year is " + year);
                break;
            default:
                System.out.println("I decided not to print the year!!");
        }
    }
}
