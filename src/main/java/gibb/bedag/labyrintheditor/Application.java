package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.persist.SaveState;
import gibb.bedag.labyrintheditor.persist.SaveStateManager;
import gibb.bedag.labyrintheditor.ui.ConsoleUi;

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
        Labyrinth labyrinth = new Labyrinth(x, y);
        ui.setLabyrinth(labyrinth);
        ui.printLabyrinth();
        while (!finished){
            try{
                ui.executeAction();
            }catch(IOException e){
                try {
                    SaveState saveState = load();
                    labyrinth = saveState.getLabyrinth();
                    ui.setLabyrinth(labyrinth);
                    ui.printLabyrinth();
                }catch (IOException ex){
                    ui.showLoadingError();
                }
            }
        }
    }
    private SaveState load() throws IOException {
        File file = ui.readLoadingFile();
        SaveStateManager saveStateManager = new SaveStateManager(file);
        return saveStateManager.read();
    }
}
