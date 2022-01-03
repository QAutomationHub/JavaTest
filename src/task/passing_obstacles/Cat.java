package task.passing_obstacles;

class Cat implements Actions {

    private String name;
    private int runDistance;
    private int jumpHeight;

    Cat (String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.printf("%s бежит!!!\n", this.name);
    }

    @Override
    public void jump() {
        System.out.printf("%s прыгает!!!\n", this.name);
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
