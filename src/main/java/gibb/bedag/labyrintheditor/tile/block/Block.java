package gibb.bedag.labyrintheditor.tile.block;

public abstract class Block {
    protected BlockType blockType;

    public Block() {
    }

    public BlockType getBlockType() {
        return blockType;
    }

    @Override
    public String toString() {
     return blockType.value;
    }
}
