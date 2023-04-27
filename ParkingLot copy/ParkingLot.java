public class ParkingLot {
    List<Slot> bikes;
    List<Slot> cars;
    List<Slot> trucks;

    ParkingLot() {
        bikes = new ArrayList<>();
        cars = new ArrayList<>();
        trucks = new ArrayList<>();
    }

    public void initSlots(int noOfBikes, int noOfCars, int noOfTrucks) {
        for(int i = 0; i < noOfBikes; i ++) bikes.add(new Slot("B" + (i + 1)));
        for(int i = 0; i < noOfCars; i ++) cars.add(new Slot("C" + (i + 1)));
        for(int i = 0; i < noOfTrucks; i ++) trucks.add(new Slot("T" + (i + 1)));
    }

    public Ticket park(Vehicle vehicle) {
        Slot freeSlot = getFreeSlot(vehicle);
        if (freeSlot == null) {
            System.out.println("No slot found, parking full for this vehicle type");
            return null;
        }
        return freeSlot.park(vehicle);
    }

    private Slot getFreeSlot(Vehicle vehicle) {
        List<Slot> findIn;
        if(vehicle instanceof Bike) {
            findIn = bikes;
        } else if(vehicle instanceof Car){
            findIn = cars;
        } else {
            findIn = trucks;
        }
        for(Slot slot : findIn) if(slot.vehicle == null) return slot;
        return null;
    }

    // Unpark -> double
}