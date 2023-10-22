package gibb.bedag.labyrintheditor.tile;

import gibb.bedag.labyrintheditor.tile.block.Block;

public class Tile {
    private boolean isFree;
    private Block block;

    public Tile() {
        this.isFree = true;
        this.block = null;
    }

    public void setTileBlock(Block block){
        if(this.isFree){
            this.block = block;
            this.isFree = false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setTileFree(){
        this.block = null;
        this.isFree = true;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public Block getBlock() {
        return this.block;
    }

    @Override
    public String toString() {
        return this.isFree ? "0" : this.block.toString();
    }
}
