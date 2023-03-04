public class Slot {
    String slotNo;
    Vehicle vehicle;

    public Slot(String slotNo) {
        this.slotNo = slotNo;
    }

    public Ticket park(Vehicle vehicle) {
        this.vehicle = vehicle;
        return new Ticket(vehicle, this);
    }

    public void unpark() {
        this.vehicle = null;
    }
} // Vehicle vehicle = new Bike("DL45K5875", "Rakesh Bhai");