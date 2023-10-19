package gibb.bedag.labyrintheditor;

public class Labyrinth {
    private int width;
    private int height;
    private final Tile[][] tiles;

    public Labyrinth(int width, int height) {
        this.tiles = new Tile[width][height];
        this.width = width;
        this.height = height;
        createTilesForLabyrinth();
    }

    private void createTilesForLabyrinth() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new Tile();
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public Tile getTile(int x, int y) {
        return this.tiles[x-1][y-1];
    }
}
