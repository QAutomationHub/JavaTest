package Stream;

public class Person {

    private String name;
    private int age;
    private Position position;

    public Person(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    static enum Position {
        ENGINEER,
        MANAGER,
        DIRECTOR
    }
}
