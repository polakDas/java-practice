package generics;

class Test<T, U> {
    T objT;
    U objU;
    public Test(T objT, U objU) {
        this.objT = objT;
        this.objU = objU;
    }

    public T getObjT() {
        return this.objT;
    }
    public U getObjU() {
        return this.objU;
    }

    public void print() {
        System.out.println(objT);
        System.out.println(objU);
    }

}

public class GenericClass {
    public static void main(String[] args) {
        Test<Integer, String> obj = new Test<>(15, "This is a string!");
        obj.print();
    }
}
