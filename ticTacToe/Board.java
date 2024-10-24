package ticTacToe;

public class Board {
    int size;
    PeiceType grid[][];

    public Board(int size) {
        this.size = size;
        this.grid = new PeiceType[this.size][this.size];
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.grid[i][j] == null) {
                    System.out.print(" | ");
                    continue;
                }
                System.out.print(this.grid[i][j].symbol + " | ");
            }
            System.out.println();
            System.out.println("-----------------");

        }
    }

    public boolean markMove(int r, int c, Player player) {
        if (this.grid[r][c] == null) {
            grid[r][c] = player.peiceType;
            return true;
        }
        return false;
    }

    public boolean isWinner() {
        System.out.println("System 1 is winner");
        return true;

    }

}
