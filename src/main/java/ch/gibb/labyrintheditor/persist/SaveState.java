package ch.gibb.labyrintheditor.persist;

import ch.gibb.labyrintheditor.Labyrinth;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveState {


    private final Labyrinth labyrinth;

    @JsonCreator
    public SaveState(@JsonProperty("Labyrinth") Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
    }

    public Labyrinth getLabyrinth() {
        return labyrinth;
    }
}
