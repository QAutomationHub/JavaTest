package task.passing_obstacles;

class Wall extends Barrier {

    private int height;

    Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    protected boolean moving(Actions actions) {
        if (height <= actions.getJumpHeight()) {
            return true;
        } else {
            return false;
        }
    }

}
