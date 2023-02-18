public class Player {
    String name;
    String colour;

    Player(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name).append(", Colour: ").append(this.colour).append("\n");
        return sb.toString();
    }
}