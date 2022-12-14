package Lesson1;

public class Cat extends Animal implements Jump, Swim {
    private final int RUN_LIMIT = 100;
    private final int SWIM_LIMIT = 100;
    private final float JUMP_LIMIT = 3.8f;
    private int swim_limit;
    private float jump_limit;

    public Cat(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        this.swim_limit = SWIM_LIMIT;
        this.jump_limit = JUMP_LIMIT;
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
    @Override
    public float getJumpLimit(){
        return jump_limit;
    }
}

