package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.tile.Tile;

public class Labyrinth {
    private int width;
    private int height;
    private Tile[][] tiles;

    public Labyrinth() {
    }

    public void setLabyrinthProperties(int width, int height) {
        this.tiles = new Tile[width][height];
        this.width = width;
        this.height = height;
    }

    public void createLabyrinth() {
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

    public Tile[] getTilesX(int x){
        return tiles[x-1];
    }

    public Tile getTile(int x, int y) {
        return tiles[x-1][y-1];
    }
}
