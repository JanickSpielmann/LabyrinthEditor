package gibb.bedag.labyrintheditor;

public class Labyrinth {
    private long width;
    private long height;
    private final Tile[][] tiles;

    public Labyrinth(long width, long height, Tile[][] tiles) {
        this.width = width;
        this.height = height;
        this.tiles = tiles;
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

    public Tile[][] getTiles() {
        return tiles;
    }
}
