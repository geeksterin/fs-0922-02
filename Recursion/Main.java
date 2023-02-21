public class Main {
    public static void main(String[] args) {
        System.out.println(powerShort(2, 5));
    }

    public static void printDecreasing(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if(n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void func(int n) { // n is passed equal to 5
        if(n <= 0) {
            System.out.println("Base: " + n);
            return;
        }
        System.out.println("Pre: " + n); // left
        func(n - 1); // rc1
        System.out.println("In1: " + n); // valley
        func(n - 2); //rc2
        System.out.println("In2: " + n); // valley
        func(n - 3); //rc3
        System.out.println("Post: " + n); // right
    }

    public static int factorial(int n) {
        if(n <= 1) return 1;
        int faith = factorial(n - 1);
        int expectation = n * faith;
        return expectation;
    }

    public static int factorialShort(int n) {
        return n <= 1 ? 1 : n * factorialShort(n - 1);
    }

    public static int fibo(int n) {
        if(n <= 1) return n;
        int f1 = fibo(n - 1);
        int f2 = fibo(n - 2);
        int exp = f1 + f2;
        return exp;
    }

    public static int fiboShort(int n) {
        return n <= 1 ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static int power(int x, int n) {
        if(n == 0) return 1;
        int faith = power(x, n - 1);
        return faith * x;
    }

    public static int powerShort(int x, int n) {
        return n == 0 ? 1 : x * power(x, n - 1);
    }
}