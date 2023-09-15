package gibb.bedag.labyrintheditor.block;

public class IndestructableBlock extends Block {

    public IndestructableBlock(int width, int height) {
        super(width, height);
        state = State.INDESTRUCTABLE;
    }
}
