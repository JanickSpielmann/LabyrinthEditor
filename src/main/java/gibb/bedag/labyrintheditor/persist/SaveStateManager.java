package gibb.bedag.labyrintheditor.persist;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import gibb.bedag.labyrintheditor.block.Block;

public class SaveStateManager {
    private final File file;
    private final ObjectMapper mapper;

    public SaveStateManager() {
        file = Path.of(System.getProperty("user.home"), "savestate.json").toFile();
        mapper = new ObjectMapper();
        PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder().allowIfSubType(Block.class).build();
        mapper.activateDefaultTyping(ptv);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }
    public void save(SaveState saveState) throws IOException{
        mapper.writeValue(file,saveState);
    }



}