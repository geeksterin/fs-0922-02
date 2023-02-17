public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Ajinkya");
        System.out.println(p1);
        Player p2 = new Player("Aman");
        System.out.println(p2);

        Board board = new Board(3);
        Game game = new Game(board, new Player[]{p1, p2});
        game.play();
    }
}