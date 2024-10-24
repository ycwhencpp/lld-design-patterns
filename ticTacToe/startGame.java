package ticTacToe;

public class startGame {
    public static void main(String[] args) {
        Game game = new Game();
        String verdict = game.startGame();
        System.out.println(verdict);
    }

}