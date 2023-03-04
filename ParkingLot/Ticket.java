import java.time.LocalTime;
public class Ticket {
    Vehicle vehicle;
    Slot slot;
    LocalTime entryTime;

    public Ticket (Vehicle vehicle, Slot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalTime.now();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.slot.slotNo).append("--").append(this.vehicle.getNumber()).append("--").append(entryTime);
        return sb.toString();
    }
}