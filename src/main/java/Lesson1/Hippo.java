package Lesson1;

public class Hippo extends Animal implements Swim {
    private int swim_limit;
    private final int RUN_LIMIT = 50;
    private final int SWIM_LIMIT = 200;

    public Hippo(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        this.swim_limit = SWIM_LIMIT;
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
}
