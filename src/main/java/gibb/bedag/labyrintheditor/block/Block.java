package gibb.bedag.labyrintheditor.block;

public abstract class Block {

    protected int width;
    protected int height;
    protected State state;

    public Block(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public State getState() {
        return state;
    }
}
