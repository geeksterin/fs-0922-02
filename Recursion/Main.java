public class Main {
    public static void main(String[] args) {
        // System.out.println(powerShort(2, 5));
        // postPrint(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 9);
        // prePrint(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 0);
        System.out.println(firstOcc(new int[]{1, 2, 3, 4, 3, 3, 7, 8, 3, 3}, 0, 3));
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
        return n <= 1 ? n : fiboShort(n - 1) + fiboShort(n - 2);
    }

    public static int power(int x, int n) {
        if(n == 0) return 1;
        int faith = power(x, n - 1);
        return faith * x;
    }

    public static int powerShort(int x, int n) {
        return n == 0 ? 1 : x * powerShort(x, n - 1);
    }

    public static int powerLog(int x, int n) {
        if(n == 0) return 1; 
        int faith = powerLog(x, n / 2);
        int exp = faith * faith;
        return n % 2 == 0 ? exp : exp * x;
    }

    public static void postPrint(int[] arr, int n) {
        if(n == -1) return;
        postPrint(arr,  n - 1);
        System.out.println(arr[n]);
    }

    public static void prePrint(int[] arr, int n) {
        if(n == arr.length) return;
        System.out.println(arr[n]);
        prePrint(arr, n + 1);
    }

    public static int max(int[] arr, int idx) {
        if(idx == arr.length - 1) return arr[idx];
        int faith = max(arr, idx + 1);
        return faith > arr[idx] ? faith : arr[idx];
    }

    public static int firstOcc(int[] arr, int idx, int ele) {
        if(idx == arr.length) return  -1;
        return arr[idx] == ele ? idx : firstOcc(arr, idx + 1, ele);
    }

    public int[] allOcc(int[] arr, int idx, int ele) {
        
    }

}