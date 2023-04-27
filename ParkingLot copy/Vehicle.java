public abstract class Vehicle {
    String number;
    String colour;
    int price;
    Vehicle(String number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.number).append("--").append(this.colour).toString();
    }
}