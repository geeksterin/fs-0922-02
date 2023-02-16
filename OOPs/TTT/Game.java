public class Game {
    Board board;
    Player[] players
    int turn;// = even -> p1; odd -> p2;
    int noOfMoves;
    boolean gameOver;
    String zeroPattern;
    String crossPattern;

    Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
        this.turn = 0;
        this.noOfMoves = 0;
        this.gameOver = false;
        zeroPattern = "";
        crossPattern = "";
        for(int i = 0; i < board.size; i ++) {
            zeroPattern += 'O';
            crossPattern += 'X'; //doubt
        }
    }

    public void play() {
        System.out.println(board);
        while(!this.gameOver) {
            this.noOfMoves ++;
            int[] idxs = getIndex();
            int rn = idxs[0], cn = idxs[1];
            board.board[rn][cn] = players[turn].symbol;
            if(this.noOfMoves >= 2 * board.size - 1 && checkIfTheGameIsEnded()) {
                System.out.println(board);
                this.gameOver = true;
                System.out.println(players[turn].name + " has won !!");
                return;
            } 
            turn = (turn + 1) % 2;
            System.out.println(board);
        }
    }

    public int[] getIndex() {
        while(true) {
            System.out.println(players[turn].name + "'s turn, give index: ");
            int idx = scn.nextInt() - 1;
            int rn = idx / board.size, cn = idx % board.size;
            if(rn < 0 || cn < 0 || rn >= board.size || cn >= board.size) {
                System.out.println("Out of bound index");
                continue;
            }
            if(board.board[rn][cn] != '-') {
                System.out.println("Position already filled, try again");
                continue;
            }
            return new int[]{rn, cn};
        }
    }

    public boolean checkIfTheGameIsEnded() {
        // ROWS
        StringBuilder sb;
        for(int i = 0; i < board.size; i ++) {
            sb =  = new StringBuilder();
            for(int j = 0; j < board.size; j ++) sb.append(board.board[i][j]);
            if(getResult(sb)) return true;
        }
        //COLUMN
        for(int i = 0; i < board.size; i ++) {
            sb =  = new StringBuilder();
            for(int j = 0; j < board.size; j ++) sb.append(board.board[j][i]);
            if(getResult(sb)) return true;
        }
        //MAJOR DIAGONAL
        int i = 0, j = 0;
        sb = new StringBuilder();
        while(i < board.size) {
            sb.append(board.board[i ++][j ++]); 
        }
        if(getResult(sb)) return true;

        //MINOR DIAGONAL
        i = 0; j = board.size - 1;
        sb = new StringBuilder();
        while(i < board.size) {
            sb.append(board.board[i ++][j --]); 
        }
        if(getResult(sb)) return true;
        return false;
    }

    public boolean getResult(StringBuilder sb) {
        if(sb.toString().equals(zeroPattern) || sb.toString().equals(crossPattern)) return true;
        return false;
    }
}