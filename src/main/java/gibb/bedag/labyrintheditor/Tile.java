package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.block.Block;

public class Tile {
    private boolean isFree;
    private long width;
    private long height;
    private Block block;

    public Tile() {
        this.isFree = true;
        this.width = 20;
        this.height = 20;
        this.block = null;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
