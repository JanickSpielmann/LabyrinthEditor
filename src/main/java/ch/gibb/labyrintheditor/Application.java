package ch.gibb.labyrintheditor;

import java.io.File;
import java.io.IOException;

public class Application {

    private final gibb.bedag.labyrintheditor.ui.ConsoleUi ui;

    public Application(gibb.bedag.labyrintheditor.ui.ConsoleUi ui) {
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
