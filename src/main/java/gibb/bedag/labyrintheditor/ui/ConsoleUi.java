package gibb.bedag.labyrintheditor.ui;

import gibb.bedag.labyrintheditor.Labyrinth;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleUi {
    private final PrintStream out;
    private final Labyrinth labyrinth;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleUi(PrintStream out, Labyrinth labyrinth) {
        this.out = out;
        this.labyrinth = labyrinth;
    }

    public void printLabyrinth(){
        printLabyrinthHeader();
        printLabyrinthBody();
    }

    private void printLabyrinthHeader() {
        out.print("    ");
        for (int x = 1; x < labyrinth.getWidth() + 1; x++) {
            formatString(x);
        }
        printSeparatingLine();
    }

    private void printLabyrinthBody() {
        for (int y = 1; y < labyrinth.getHeight() + 1; y++) {
            formatString(y);
            for (int x = 1; x < labyrinth.getWidth() + 1; x++) {
                out.print(" " + labyrinth.getTile(x, y).toString() + " |");
            }
            printSeparatingLine();
        }
    }

    private void formatString(int number) {
        out.printf("%3s|", number);
    }

    private void printSeparatingLine(){
        out.println("\n---|" + "---|".repeat(labyrinth.getWidth()));
    }
}
