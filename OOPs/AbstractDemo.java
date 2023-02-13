abstract class MyClass {
    abstract public void meth1();
    abstract public void meth2();
    void meth3() {
        System.out.println("Kuchh kaam");
    }
}

class Test extends MyClass {
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        MyClass obj = new Test();
        obj.meth3();
    }
}