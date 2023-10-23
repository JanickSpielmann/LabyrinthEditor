package gibb.bedag.labyrintheditor;

import gibb.bedag.labyrintheditor.tile.Tile;

public class Labyrinth {
    private final int width;
    private final int height;
    private final Tile[][] tiles;

    public Labyrinth(int width, int height) {
        this.tiles = new Tile[width][height];
        this.width = width;
        this.height = height;
    }

    public Labyrinth createLabyrinth(int width, int height) {
        Labyrinth labyrinth = new Labyrinth(width, height);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new Tile();
            }
        }
        return labyrinth;
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
