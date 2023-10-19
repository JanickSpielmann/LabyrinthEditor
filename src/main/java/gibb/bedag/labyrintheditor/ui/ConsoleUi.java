package gibb.bedag.labyrintheditor.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleUi {
    private final PrintStream out;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUi(PrintStream out) {
        this.out = out;
    }
}
