public class Ticket {
    static int ticketNo = 0;
    Vehicle vehicle;
    Slot slot;
    LocalTime entryTime;

    Ticket(Vehicle vehicle, Slot slot) {
        this.ticketNo ++;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalTime.now();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ticketNo).append("--").append(vehicle.number).append("--").append(entryTime);
        return sb.toString();
    }

}