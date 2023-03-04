public class Car extends Vehicle {
    int parkingPrice;
    public Car(String number, String ownerName) {
        super(number, ownerName);
        super.parkingPrice = 20;
    }
}