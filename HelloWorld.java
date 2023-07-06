public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String name = "Mr. X";
        int age = 18;
        boolean isAlive = true;
        double balance = 169.58;

        if (isAlive) {
            System.out.println(name + " is still alive at his age " + age + " with " + balance + "$");
        } else {
            System.out.println("Sorry mate, he is no more.");
            System.out.println("Done");
        }
    }
}