package Lesson1;

public class Cock extends Animal implements Jump {
    private final int RUN_LIMIT = 100;
    private final float JUMP_LIMIT = 10f;
    private float jump_limit;

    public Cock(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        this.jump_limit = JUMP_LIMIT;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
    @Override
    public float getJumpLimit(){
        return jump_limit;
    }
}
