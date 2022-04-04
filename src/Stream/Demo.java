package Stream;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Demo {

    public static class Person {
        int age;

        public int getAge() {
            return age;
        }

        public Person(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {

// * Можно ли в бар ?
// * Способ 1

//        Predicate<Person> canGoPub = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge() >= 18;
//            }
//        };
// * Способ 2. Короткая запись

        Predicate<Person> canGoPub = (person) -> person.getAge() >= 18;


        Person p1 = new Person(17);
        Person p2 = new Person(21);

        System.out.println(canGoPub.test(p1));
        System.out.println(canGoPub.test(p2));

// * Возвращает куб числа
//        UnaryOperator<Integer> inCube = new UnaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i * i * i;
//            }
//        };

// * Способ 2. Короткая запись

        UnaryOperator<Integer> inCube = i -> i * i * i;


        System.out.println(inCube.apply(3));


// * Преобразует строку в число
//        Function<String, Integer> convertStrToInt = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                Integer result;
//                try {
//                    result = Integer.parseInt(s);
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                    result = null;
//                }
//                return result;
//            }
//        };

        Function<String, Integer> convertStrToInt = s -> {
            Integer result;
            try {
                result = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                result = null;
            }
            return result;
        };

        System.out.println(convertStrToInt.apply("123"));
        System.out.println(convertStrToInt.apply("123a"));

    }

}
