package Generics_Exercises.CustomList;

import java.lang.annotation.Inherited;
import java.util.Scanner;

public class Engine implements Runnable {

    private static final String END_COMMAND = "END";
    private Scanner scanner;
    private String input;
    private CommandParser commandParser;

    public Engine() {
        this.scanner = new Scanner(System.in);
        this.input = "";
        this.commandParser = new CommandParser();
    }

    @Override
    public void run() {
        this.input = this.scanner.nextLine();
        while (!this.input.equals(Engine.END_COMMAND)) {
            this.commandParser.execute(this.input);
            this.input = this.scanner.nextLine();
        }
    }
}
