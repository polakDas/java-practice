package final_class;

final class MyString {
    public void addSomething(String str) {
        System.out.println(str + "!!");
    }
}

// cannot be inherited

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString();
        str.addSomething("My name is something");
    }
}
