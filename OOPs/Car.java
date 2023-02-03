import java.util.*;
public class Car {
    String company;
    String name;
    String colour;
    int seatCap;

    public Car(String company, String name, String colour, int seatCap) {
        this.company = company;
        this.name = name;
        this.colour = colour;
        this.seatCap = seatCap;
    }

    public void run(int speed) {
        System.out.println("Running at speed" + speed);
    }

    public void stop() {
        System.out.println("Stopped");
    }
}