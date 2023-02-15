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

        // CustomArrayList arr = new CustomArrayList();
        // arr.add(1);
        // arr.add(2);
        // System.out.println(arr);
        // arr.add(2);
        // arr.add(2);
        // arr.add(2);
        // arr.add(2);
        // System.out.println(arr);
        // System.out.println(arr.size());
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // arr.add(3);
        // System.out.println(arr);
        // System.out.println(arr.size());

        // CustomStack apnaStack = new CustomStack();
        // apnaStack.push(5);
        // apnaStack.push(6);
        // System.out.println(apnaStack);
        // System.out.println(apnaStack.pop());
        // System.out.println(apnaStack.peek());
        // System.out.println(apnaStack.pop());
        // System.out.println(apnaStack.pop());
        // System.out.println(apnaStack.isEmpty());
        // System.out.println(apnaStack.size());
        // System.out.println(apnaStack);

        int[] arr = new int[5];
        for(int i : arr) System.out.print(i + " ");
        update(arr);
        for(int i : arr) System.out.print(i + " ");
        // System.out.println(a);
         Person sanowar = new Person("Sanowar", 22);
        Person sanowar2 = new Person();
        System.out.println(sanowar2.name);
        System.out.println(sanowar2.age);
    }

    public static void update(int[] arr) {
        for(int i = 0; i < 5; i ++) arr[i] += i;
    }

   
}
