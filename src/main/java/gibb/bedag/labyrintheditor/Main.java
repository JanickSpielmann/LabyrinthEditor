package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.ui.ConsoleUi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsoleUi ui = new ConsoleUi(System.out, new Scanner(System.in));
        Application application = new Application(ui);

        application.start();
    }
}
