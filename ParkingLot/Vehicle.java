public abstract class Vehicle {
    private String number;
    private String ownerName;
    int parkingPrice = 10;

    public Vehicle(String number, String ownerName) {
        this.number = number;
        this.ownerName = ownerName;
    }

    public String getNumber(){return this.number;}
    public void setNumber(String number){this.number = number;}
    public String getOwnerName(){return this.ownerName;}
    public void setOwnerName(String ownerName){this.ownerName = ownerName;}
}