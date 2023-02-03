import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Car scorpio = new Car("Mahindra", "Scorpio", "Black", 7);
        // System.out.println(scorpio.company + ", " + scorpio.name + ", " + scorpio.colour + ", " + scorpio.seatCap);
        // scorpio.run(60);

        BankCustomer cust = new BankCustomer("Ganesh Gaitonde", "Bhagwan", 1234567, 34567876);
        cust.deposit(5000);
        cust.withdraw(1234);
    }
}