// Java stdin and stdout

package hackerrank;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // take inputs
        int i = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        double d = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();

        // print outputs
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
