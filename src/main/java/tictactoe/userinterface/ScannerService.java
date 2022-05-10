package tictactoe.userinterface;

import java.util.Scanner;

public class ScannerService implements UserInterface {
    private final Scanner scanner = new Scanner(System.in);

    public ScannerService(){
    }

    public String getNextInput(){
        return scanner.nextLine();
    }

    public void nextOutput(String nextOutput){
        System.out.println(nextOutput);
    }
}
