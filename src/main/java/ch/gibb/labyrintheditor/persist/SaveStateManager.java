package ch.gibb.labyrintheditor.persist;

import java.io.File;
import java.io.IOException;

import ch.gibb.labyrintheditor.persist.SaveState;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;



public class SaveStateManager {
    private final File file;
    private final ObjectMapper mapper;

    public SaveStateManager(File file) {
        this.file = file;
        mapper = new ObjectMapper();
        PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder().allowIfSubType(Block.class).build();
        mapper.activateDefaultTyping(ptv);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    public void save(SaveState saveState) throws IOException {
        mapper.writeValue(file, saveState);
    }

    public boolean saveStateExists() {
        return file.exists();
    }

    public void delete() {
        file.delete();
    }

    public SaveState read() throws IOException {
        SaveState saveState = mapper.readValue(file, SaveState.class);
        return saveState;
    }
}