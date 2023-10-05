import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // an array of integers
        int[] nums = { 310, 105, 200, 390, 405, 250 };

        // access the arrary elemtns
        System.out.println("Main array");
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // find the max
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Max number of this arrary is: " + max);

        // data structure
        Arrays.sort(nums);
        System.out.println("Sorted form of this array.");
        System.out.println(Arrays.toString(nums));
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        // find using binary search
        System.out.println("Index of 390 is: " + Arrays.binarySearch(nums, 390));

        /*
         * there are other methods like
         * slicing arrary -> copyOfRange(nums1, 1, 4)
         * compare arrarys -> compare(nums1, nums2)
         * extend the range -> copyOf(nums1, 10)
         * check quality -> equals(nums1, nums2) / deepEquals(nums1, nums2)
         * and many more
         */

        // multi dimensional array
        int[][][] mnums = { { { 5, 1, 3 }, { 6, 3, 9 } }, { { 5, 6, 9 }, { 8, 2, 5 } } };
        System.out.println("Multi dimensional array");
        System.out.println(Arrays.deepToString(mnums));
        System.out.println("Single element from m-dimentional arrary(mnums[1][0][2]): " + mnums[1][0][2]);

        // print this in tabular format
        System.out.println("Print m-dimentional arrary in tabular format");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(mnums[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // jagged arrary -> define the numbers of rows but numbers of columns is
        // undefined
        System.out.println("Jagged arrary");
        int[][] jnums = new int[2][];
        jnums[0] = new int[] { 5, 9, 3 };
        jnums[1] = new int[] { 9, 6, 5, 8, 4, 1 };
        System.out.println(Arrays.deepToString(jnums));
    }
}
