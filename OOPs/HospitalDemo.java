abstract class Hospital {
    abstract public void opd();
    abstract public void emergency();
    abstract public void billing();
    public void rulesAndRegulation() {
        System.out.println("RR");
    }
    
}

class AmitNH extends Hospital {
    
}

public class AbstractDemo {
    public static void main(String[] args) {
        MyClass obj = new Test();
        obj.meth3();
    }
}