package gibb.bedag.labyrintheditor;

public class DestructableBlock extends Block {

    private boolean exists;

    public DestructableBlock(int width, int height) {
        super(width, height);
        state = State.DESTRUCTABLE;
        exists = true;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
