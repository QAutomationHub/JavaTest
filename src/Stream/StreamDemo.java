package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Вася", 35, Person.Position.ENGINEER));
        personList.add(new Person("Петя", 41, Person.Position.MANAGER));
        personList.add(new Person("Олег", 55, Person.Position.MANAGER));
        personList.add(new Person("Евклид", 39, Person.Position.ENGINEER));
        personList.add(new Person("Герасим", 42, Person.Position.ENGINEER));
        personList.add(new Person("Саня", 29, Person.Position.MANAGER));
        personList.add(new Person("Дима", 18, Person.Position.ENGINEER));
        personList.add(new Person("Леша", 61, Person.Position.DIRECTOR));
        personList.add(new Person("Сережа", 37, Person.Position.ENGINEER));
        personList.add(new Person("Петр", 28, Person.Position.MANAGER));
        personList.add(new Person("Василий", 45, Person.Position.ENGINEER));
        personList.add(new Person("Ян", 55, Person.Position.ENGINEER));
        personList.add(new Person("Зураб", 60, Person.Position.MANAGER));

        List<String> engineersNames = personList.stream()
                .filter(person -> person.getPosition() == Person.Position.ENGINEER)
                .sorted(Comparator.comparing(p -> p.getAge()))
                .map(object -> object.getName())
                .peek(name -> System.out.println(name))
                .collect(Collectors.toList());

    }


}
