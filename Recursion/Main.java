public class Main {
    public static void main(String[] args) {
        printIncreasing(100);
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

    public static void func(int n) { //n is passed equal to 5
        if(n <= 0) {
            System.out.println("Base: " + n);
            return;
        }
        System.out.println("Pre: " + n);
        func(n - 1);
        System.out.println("In: " + n);
        func(n - 2);
        System.out.println("Post: " + n);
    }
}