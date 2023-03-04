import java.util.*;
import java.time.LocalTime;
public class ParkingLot {
    List<Slot> bikes, cars, trucks;

    ParkingLot() {
        bikes = new ArrayList<>();
        cars = new ArrayList<>();
        trucks = new ArrayList<>();
    }

    public void initSlots() {
        for(int i = 0; i < 10; i ++) bikes.add(new Slot("B"+(i + 1)));
        for(int i = 0; i < 6; i ++) cars.add(new Slot("C"+(i + 1)));
        for(int i = 0; i < 4; i ++) trucks.add(new Slot("T"+(i + 1)));
    }

    public Ticket park(Vehicle vehicle) {
        Slot freeSlot = null;
        if(vehicle instanceof Bike) {
            freeSlot = findSlot("Bike");
        } else if (vehicle instanceof Car) {
            freeSlot = findSlot("Car");
        } else {
            freeSlot = findSlot("Truck");
        }  
        if(freeSlot == null) {
            System.out.println("No Slot Available");
            return null;
        }
        return new Ticket(vehicle, freeSlot);
    }

    public Slot findSlot(String type) {
        List<Slot> toFindIn = null;
        if(type.equals("Bike")) toFindIn = bikes;
        else if(type.equals("Car")) toFindIn = cars;
        else toFindIn = trucks;
        for(Slot slot : toFindIn) if(slot.vehicle == null) return slot;
        return null;
    }

    public double unpark(Ticket ticket) {
        double amount = (LocalTime.now().getSecond() - ticket.entryTime.getSecond()) * ticket.vehicle.parkingPrice;
        ticket.slot.unpark();
        return amount;
    }
}