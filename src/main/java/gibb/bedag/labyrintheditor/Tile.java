package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.block.Block;

public class Tile {
    private boolean isFree;
    private Block block;

    public Tile() {
        this.isFree = true;
        this.block = null;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        if(free) setBlock(null);
        isFree = free;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        setFree(block == null);
        this.block = block;
    }

    @Override
    public String toString() {
        return isFree ? "0" : block.toString();
    }
}
