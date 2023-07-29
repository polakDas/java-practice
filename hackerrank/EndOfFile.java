package hackerrank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (scan.hasNext()) {
            i++;
            String s = scan.nextLine();
            System.out.println(i + " " + s);
        }

        scan.close();
    }
}
