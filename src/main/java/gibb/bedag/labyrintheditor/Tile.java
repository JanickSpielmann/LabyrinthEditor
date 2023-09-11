package gibb.bedag.labyrintheditor;

public class Tile {
    private boolean isFree;

    public Tile(boolean isFree) {
        this.isFree = isFree;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
