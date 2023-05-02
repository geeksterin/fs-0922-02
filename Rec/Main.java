public class Main {
    public static void main(String[] args) {
        // printInc(10);
        // printDec(10);
        // printIncDec(10);
        // System.out.println(fact(10));
        // fun(5);
        // System.out.println(fib(10));
        System.out.println(max(new int[] {1, 2, 5, 13, 5, 2, 10}, 0));
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

    public static void fun(int n) { // n = 5
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

    public static int fib(int n) {
        if(n <= 1) return n;
        int f1 = fib(n - 1), f2 = fib(n - 2);
        int exp = f1 + f2;
        return exp;
    }

    public static void disp(int[] arr, int i) {
        if(i == arr.length) return;
        
        System.out.println(arr[i]);
        disp(arr, i + 1);
        System.out.println(arr[i]);
    }

    public static int max(int[] arr, int i, int max) {
        if(i == arr.length - 1) return arr[i];
        int maxAhead = max(arr, i + 1);
        return Math.max(maxAhead, arr[i]);
    }

    public static void max(int[] arr, int i, int[] maxSF) {
        if(i == arr.length) {
            return;
        }
        maxSF[0] = Math.max(maxSF[0], arr[i]);
        max(arr, i + 1, maxSF);
    }
}