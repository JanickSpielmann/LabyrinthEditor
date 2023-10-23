package gibb.bedag.labyrintheditor.ui;

import gibb.bedag.labyrintheditor.Labyrinth;
import gibb.bedag.labyrintheditor.persist.SaveState;
import gibb.bedag.labyrintheditor.persist.SaveStateManager;
import gibb.bedag.labyrintheditor.ui.shortcuts.Shortcut;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;


public class ConsoleUi {
    private final PrintStream out;
    private final Scanner scanner;
    private static final String NEW_LINE = "\n";
    private Labyrinth labyrinth;
    private static final String regex_labyrinth_size = "^[1-9]\\d?$|^100$";

    public ConsoleUi(PrintStream out, Scanner scanner) {
        this.out = out;
        this.scanner = scanner;
    }

    public void setLabyrinth(Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
    }

    public void executeAction() {
        String input = readUserInput();
        if (input.length() == 1) {
            Shortcut shortcut = Shortcut.parseShortcut(input.charAt(0));
            switch (Objects.requireNonNull(shortcut)) {
                case SAVE -> save();
                case LABYRINTH -> printLabyrinth();
                case MANUAL -> printManual();
            }
        }
    }

    private void save() {
        SaveState savestate = new SaveState(this.labyrinth);
        File file = readWritingFile();
        SaveStateManager saveStateManager = new SaveStateManager(file);
        try {
            saveStateManager.save(savestate);
        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }

    private File readWritingFile() {
        out.println("Bitte geben Sie den gesamten Pfad samt Filenamen zum speichern der Datei an.");
        File file = new File(readUserInput());
        return file;
    }

    private int readUserIntegerInput() {
        String input = readUserInput();
        if (input.matches(regex_labyrinth_size)) {
            return Integer.parseInt(input);
        } else {
            throw new NumberFormatException();
        }
    }

    private String readUserInput() {
        return scanner.nextLine();
    }

    public int readLabyrinthWidth() {
        out.print("Breite: ");
        return readUserIntegerInput();
    }

    public int readLabyrinthHeight() {
        out.print("Höhe: ");
        return readUserIntegerInput();
    }

    public void printManual() {
        generateManual();
    }

    public void printLabyrinth() {
        printLabyrinthHeader();
        printLabyrinthBody();
    }

    private void printLabyrinthHeader() {
        out.print("    ");
        for (int x = 1; x < labyrinth.getWidth() + 1; x++) {
            formatLabyrinthString(x);
        }
        printSeparatingLine();
    }

    private void printLabyrinthBody() {
        for (int y = 1; y < labyrinth.getHeight() + 1; y++) {
            formatLabyrinthString(y);
            for (int x = 1; x < labyrinth.getWidth() + 1; x++) {
                out.print(" " + labyrinth.getTile(x, y).toString() + " |");
            }
            printSeparatingLine();
        }
    }

    private void generateManual() {
        String headerText = "|Folgende Abkürzungen können verwendet werden: |";
        printLine('-', headerText.length(), true);
        out.print(headerText);
        printLine('|', headerText.length(), true);
        printManualBody(headerText.length());
    }

    private void printManualBody(int headerLength) {
        String keyFormat = "|%3s | ";
        String definitionFormat = "%-" + (headerLength - keyFormat.length() - 1) + "s|";
        for (Shortcut shortcut : Shortcut.values()) {
            String key = String.format(keyFormat, shortcut.key);
            String definition = String.format(definitionFormat, shortcut.definition);
            out.println(key + definition);
        }
        printLine('-', headerLength, false);
    }

    private void formatLabyrinthString(int number) {
        out.printf("%3s|", number);
    }

    private void printLine(char separator, int length, boolean... type) {
        String newLine = type[0] ? NEW_LINE : "";
        out.println(newLine + separator + "-".repeat(length - 2) + separator);
    }

    private void printSeparatingLine() {
        out.println(NEW_LINE + "---|".repeat(labyrinth.getWidth() + 1));
    }
}
