public class Slot {
    String slotNo;
    Vehicle vehicle;

    Slot(String slotNo) {
        this.slotNo = slotNo;
    }

    public Ticket park(Vehicle vehicle) {
        this.vahicle = vehicle;
        return new Ticket(vehicle, this);
    }

    public void unpark() {
        this.vehicle = null;
    }
}