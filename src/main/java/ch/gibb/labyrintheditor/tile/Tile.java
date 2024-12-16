package ch.gibb.labyrintheditor.tile;

public class Tile {
    private int x;
    private int y;
    private TileType type;
    private char occupation = 'f';

    public Tile() {
        // for JPA
    }

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        this.type = TileType.FREE;
    }

    public TileType getType() {
        return type;
    }

    public void setType(TileType type) {
        this.type = type;
    }

    public char getOccupation() {
        return occupation;
    }

    public boolean isEmpty() {
        return this.type == TileType.FREE && this.occupation == 'f';
    }
}