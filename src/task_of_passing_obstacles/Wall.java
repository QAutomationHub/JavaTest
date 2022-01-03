package task_of_passing_obstacles;

class Wall extends Barrier {

    private int height;

    Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    @Override
    protected boolean moving(Actions actions) {
//        System.out.println("На горизонте появляется препятствие " + super.getName() + " высотой: " + this.height);
        if (getHeight() <= actions.getJumpHeight()) {
            return true;
        } else {
            return false;
        }
    }

}
