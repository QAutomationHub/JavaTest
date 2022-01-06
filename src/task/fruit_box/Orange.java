package task.fruit_box;

class Orange extends Fruit {

    private String name = "Orange";

    Orange(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                "weight='" + super.getWeight() + '\'' +
                '}';
    }
}
