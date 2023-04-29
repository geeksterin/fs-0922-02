public class Main {
    public static void main(String[] args) {
        // printInc(10);
        // printDec(10);
        // printIncDec(10);
        System.out.println(fact(10));
    }

    public static void printInc(int n) {
        // exp i to n
        // faith 1 to n - 1
        // work print n
        if(n == 0) return;
        printInc(n - 1);
        System.out.println(n);
    }

    public static void printDec(int n) {
        // exp n to 1
        // faith n - 1 to 1
        // work print n
        if(n == 0) return;
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printIncDec(int n) {
        // exp n to 1 - 1 to n
        // faith n - 1 to 1 then 1 to n - 1
        // work - print n before and after faith
        if(n == 0) return;
        System.out.println(n);
        printIncDec(n - 1);
        System.out.println(n);
    }

    public static int fact(int n) {
        if(n == 0) return 1;
        int faith = fact(n - 1);
        int exp = faith * n;
        return exp;
    }

    public static int powerLin(int x, int n) {
        // return n == 0 ? 1 : powerLin(x, n - 1) * x;
        if(n == 0) return 1;
        int faith = powerLin(x, n - 1);
        int exp = faith * x;
        return exp;
    }

    public static void func(int n) { // n = 5
        if(n <= 0) {
            System.out.println("Base: " + n);
            return;
        } 
        System.out.println("Pre: " + n);
        fun(n - 1);
        System.out.println("In: " + n);
        fun(n - 2);
        System.out.println("Post: " + n);
    }

    public static int powerLog(int x, int n) {
        if(n == 0) return 1;
        int faith = powerLog(x, n / 2);
        int exp = faith * faith;
        if(n % 2 != 0) exp *= x;
        return exp;
    }
}