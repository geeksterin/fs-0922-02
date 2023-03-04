public class Bike extends Vehicle {
    public Bike(String number, String ownerName) {
        super(number, ownerName);
        super.parkingPrice = 10;
    }
}