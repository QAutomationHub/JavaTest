package task_of_passing_obstacles;

class Road extends Barrier {

    private int length;

    Road(String name, int length) {
        super(name);
        this.length = length;
    }

    int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
//        System.out.println("На горизонте появляется препятствие " + super.getName() + " длиной: " + this.length);
        if (getLength() <= actions.getRunDistance()) {
            return true;
        } else {
            return false;
        }
    }

}
