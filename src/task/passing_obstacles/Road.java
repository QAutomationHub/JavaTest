package task.passing_obstacles;

class Road extends Barrier {

    private int length;

    Road(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    protected boolean moving(Actions actions) {
        if (length <= actions.getRunDistance()) {
            return true;
        } else {
            return false;
        }
    }

}
