package ch.gibb.labyrintheditor;

import ch.gibb.labyrintheditor.ui.ConsoleUi;

import java.io.File;
import java.io.IOException;

public class Application {

    private final ConsoleUi ui;

    public Application(ConsoleUi ui) {
        this.ui = ui;
    }


    public void start(){
        boolean finished = false;
        int x = ui.readLabyrinthWidth();
        int y = ui.readLabyrinthHeight();
        Labyrinth  labyrinth = new Labyrinth(x, y);
        ui.setLabyrinth(labyrinth);
        ui.printLabyrinth();
        while (!finished){
            ui.executeAction();
        }
    }
}
