package tictactoe;

import tictactoe.userinterface.UserInterface;

import java.util.*;

public class TestUserInterface implements UserInterface {

    private final List<String> output = new ArrayList<>();
    private final Iterator<String> inputIterator;

    public TestUserInterface(String input) {
        this.inputIterator = Arrays.asList(input.split("\n")).stream().iterator();
    }

    public String getNextInput(){
        if(inputIterator.hasNext()){
            return inputIterator.next();
        }
        throw new Error();
    }


    public void nextOutput(String nextOutput){
        this.output.add(nextOutput.stripTrailing());
    }

    public List<String> getOutput() {
        return this.output;
    }
}
