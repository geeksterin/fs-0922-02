class Singelton {
    static Singelton onlyObject = null;
    static int objCount = 0;
    private Singelton() {

    }

    public static Singelton getInstance() {
        if(objCount < 3) {
            objCount ++;
            return new Singelton();
        }
        System.out.println("cannot create more objects");
        return null;
    }
}


public class SingletonDemo {
    public static void main(String[] args) {
        Singelton obj1 = Singelton.getInstance();
        Singelton obj2 = Singelton.getInstance();
        Singelton obj3 = Singelton.getInstance();
        Singelton obj4 = Singelton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}