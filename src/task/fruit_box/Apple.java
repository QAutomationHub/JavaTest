package task.fruit_box;

class Apple extends Fruit {

    private String name = "Apple";

    Apple(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                "weight='" + super.getWeight() + '\'' +
                '}';
    }
}
