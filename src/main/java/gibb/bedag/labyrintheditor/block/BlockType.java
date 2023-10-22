package gibb.bedag.labyrintheditor.block;

public enum BlockType {
    DESTRUCTIBLE("1"),
    INDESTRUCTIBLE("2");

    public final String value;

    BlockType(String value){
        this.value = value;
    }
}
