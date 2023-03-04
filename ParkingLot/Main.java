public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.initSlots();
        Car c1 = new Car("DL6A5757", "Nikhil Saini");
        Ticket t1 = parkingLot.park(c1);
        System.out.println(t1);

        try {
            Thread.sleep(3000);
        } catch(Exception e) {

        }
        
        System.out.println(parkingLot.unpark(t1));
    }
}