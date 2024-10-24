package ticTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> deque;
    Board gameBoard;
    int PeicesFilled;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        PeicesFilled = 0;
        deque = new LinkedList<>();

        Player player1 = new Player("Anurag", new peiceX());
        Player player2 = new Player("Harsh", new PeiceY());

        deque.add(player1);
        deque.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame() {
        while (true) {
            Player playerTurn = deque.removeFirst();
            gameBoard.print();
            if (this.gameBoard.size * this.gameBoard.size == PeicesFilled) {
                break;
            }

            // userimput
            System.out.print("Player " + playerTurn.name + " Enter row, column");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] moves = s.split(",");
            int inputRow = Integer.valueOf(moves[0]);
            int inputCol = Integer.valueOf(moves[1]);

            boolean verdict = gameBoard.markMove(inputRow, inputCol, playerTurn);
            if (!verdict) {
                System.out.println("wrong move chossen!");
                deque.addFirst(playerTurn);
                continue;
            }
            deque.addLast(playerTurn);

            boolean winner = gameBoard.isWinner();

            if (winner) {
                sc.close();
                return "Winner is " + playerTurn.name;
            }

        }
        return "Tie";
    }
}
