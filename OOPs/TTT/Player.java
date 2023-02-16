public class Player {
    String name;
    char symbol;
    static int playerCount = 0;
    
    Player(String name) {
        this.name = name;
        this.symbol = playerCount == 0 ? 'X' : 'O';
        playerCount ++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name).append("\n").append("Symbol: ").append(this.symbol).append("\n");
        return sb.toString();
    }
}