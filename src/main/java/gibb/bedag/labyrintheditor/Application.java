package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.ui.ConsoleUi;

public class Application {

    private final ConsoleUi ui;
    private Labyrinth labyrinth;

    public Application(ConsoleUi ui) {
        this.ui = ui;
    }


    public void start(){
        boolean finished = false;
        int x = ui.readLabyrinthWidth();
        int y = ui.readLabyrinthHeight();
        this.labyrinth = labyrinth.createLabyrinth(x, y);
        ui.setLabyrinth(labyrinth);
        ui.printLabyrinth();
        while (!finished){
            ui.executeAction();
        }
    }
}
