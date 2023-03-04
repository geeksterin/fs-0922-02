public class Truck extends Vehicle {
    int parkingPrice;
    public Truck(String number, String ownerName) {
        super(number, ownerName);
        super.parkingPrice = 40;
    }
}