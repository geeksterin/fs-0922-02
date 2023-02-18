import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Board board = new Board(null);
        // System.out.println(board);
        HashMap<String, Jumper> hm = new HashMap<>();
        hm.put( "6", new Jumper(new Coordinates(9, 5), new Coordinates(6, 6)));
        hm.put("97", new Jumper(new Coordinates(0, 1), new Coordinates(9, 9)));
        hm.put("21", new Jumper(new Coordinates(7, 0), new Coordinates(0, 9)));
        hm.put("64", new Jumper(new Coordinates(3, 3), new Coordinates(7, 4)));
        Board board = new Board(hm);
        Player[] players = new Player[]{new Player("Aman", "Red"), new Player("Ajinkya", "Blue")};
        Game game = new Game(board, players);
        game.play();
    }
}