package gibb.bedag.labyrintheditor;

public class Labyrinth {
    private long width;
    private long height;
    private final String[] tiles;

    public Labyrinth(long width, long height, String[] tiles) {
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

    public String[] getTiles() {
        return tiles;
    }
}
