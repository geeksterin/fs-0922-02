import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Car scorpio = new Car("Mahindra", "Scorpio", "Black", 7); // 
        // Car alto = new Car();
        // Car i10 = new Car("Hyundai", "i10", "Gray", '9');
        // System.out.println(scorpio);
        // System.out.println(i10);
        // System.out.println(alto);
        // BankCustomer cust = new BankCustomer("Ganesh Gaitonde", "Bhagwan", 1234567, 34567876);
        // cust.deposit(5000); 
        // cust.withdraw(1234);

        // Temp t1 = new Temp(5, 6);
        // Temp t2 = new Temp(5, 7);
        // System.out.println("t1 -> " + t1.x + ", " + t1.y);
        // System.out.println("t2 -> " + t2.x + ", " + t2.y);
        
        // t1.x ++;
        // t1.y ++;
        // t2.x ++;
        // t2.y ++;
        // Temp.y ++;
    
        // System.out.println("t1 -> " + t1.x + ", " + t1.y);
        // System.out.println("t2 -> " + t2.x + ", " + t2.y);

        CustomArrayList arr = new CustomArrayList();
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}

class Temp {
    int x;
    static int y = 10;

    Temp(int x, int y) {
        this.x = x;
        this.y = y;
    }
}