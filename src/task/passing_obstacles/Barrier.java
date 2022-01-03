package task.passing_obstacles;

public abstract class Barrier {

    private String name;

    Barrier(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    protected abstract boolean moving(Actions actions);

}
