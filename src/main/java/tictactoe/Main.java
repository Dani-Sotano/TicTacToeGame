package tictactoe;

import tictactoe.userinterface.ScannerService;
import tictactoe.userinterface.UserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface userInterface = new ScannerService();
        new TicTacToeGame(userInterface);
    }
}
