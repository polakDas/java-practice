public class JavaMethos {
    public static void main(String[] args) {
        int[] numbers = { 1, 5, 6, 9, 7, 5, 2 };

        // add number using staic method. (static method can be called directly from
        // class)
        sum(numbers);

        // add number using instance method
        JavaMethos sum = new JavaMethos();
        sum.addNumbers(numbers);
    }

    // static methods
    static void sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println(result);
    }

    // instance method
    void addNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println(result);
    }
}
