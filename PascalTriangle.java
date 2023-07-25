// Leetcode Problem #118

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // Assign the first value
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = result.get(result.size() - 1);
            List<Integer> row = new ArrayList<>();

            // add 1 to the front
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j) + previousRow.get(j - 1));
            }

            // add 1 to the rear
            row.add(1);
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTriangle solution = new PascalTriangle();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of rows you want.");

            int numRows = scanner.nextInt();

            List<List<Integer>> triangles = solution.generate(numRows);

            System.out.println("Pascal's Triangle: ");
            for (List<Integer> row : triangles) {
                System.out.println(row);
            }

            System.out.println();
            System.out.println(triangles);
        }
    }
}
