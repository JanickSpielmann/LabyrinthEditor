package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.ui.ConsoleUi;

public class Application {

    private final ConsoleUi ui;
    private Labyrinth labyrinth;

    public Application(ConsoleUi ui, Labyrinth labyrinth) {
        this.ui = ui;
        this.labyrinth = labyrinth;
    }

    public void start(){
        boolean finished = false;
        int x = ui.readLabyrinthWidth();
        int y = ui.readLabyrinthHeight();
        labyrinth.setLabyrinthProperties(x, y);
        labyrinth.createLabyrinth();
        ui.setLabyrinth(labyrinth);
        ui.printLabyrinth();
        while (!finished){
            ui.readUserInput();
        }
    }
}
