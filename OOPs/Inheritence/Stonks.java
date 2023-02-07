class Parent {
    int x = 1;
    void invest() {
        System.out.println("Invest in FD");
    }
}

class Child extends Parent{
    int x = 2;
    
    @Override
    void invest() {
        System.out.println("Adani uncle OP");
    }
}

public class Stonks {
    public static void main(String[] args) {
        Child child = new Child();
        child.invest();
    }
}