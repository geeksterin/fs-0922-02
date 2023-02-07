import java.util.*;
public class Car {
    String company;
    String name;
    String colour;
    int seatCap;

    public Car() { //non param
        System.out.println("Non Param called");
    }

    public Car(String company, String name, String colour) { //param
        System.out.println("Param called");
        this.company = company;
        this.name = name;
        this.colour = colour;
    } 

    public Car(String company, String name, String colour, int seatCap) { //param
        System.out.println("Param called");
        this.company = company;
        this.name = name;
        this.colour = colour;
        this.seatCap = seatCap;
    } 
    public Car(String company, String name, String colour, char seatCap) { //param
        System.out.println("Param called");
        this.company = company;
        this.name = name;
        this.colour = colour;
        this.seatCap = seatCap - '0';
    } 

    public void run(int speed) {
        System.out.println("Running at speed" + speed);
    }

    public void stop() {
        System.out.println("Stopped");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.company).append(", ").append(this.name).append(", ").append(this.colour).append(", ").append(this.seatCap);
        return sb.toString();
    }
}