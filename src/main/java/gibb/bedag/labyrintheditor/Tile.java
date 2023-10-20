package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.block.Block;

public class Tile {
    private boolean isFree;
    private Block block;

    public Tile() {
        this.isFree = true;
        this.block = null;
    }

    public void setTileProperties(boolean isFree, Block block) {
        this.isFree = isFree;
        this.block = isFree ? null : block;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public void setFree(boolean free) {
        this.isFree = free;
    }

    public Block getBlock() {
        return this.block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return this.isFree ? "0" : this.block.toString();
    }
}
