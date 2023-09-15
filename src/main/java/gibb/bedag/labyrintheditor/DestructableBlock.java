package gibb.bedag.labyrintheditor;

public class DestructableBlock extends Block {


    public DestructableBlock(int width, int height) {
        super(width, height);
        state = State.DESTRUCTABLE;
    }
}
