package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsDemo {

    public static void main(String[] args) {

        // * Пример 1
//        Optional<Integer> result = Stream
//                .iterate(5, x -> x + 5)
//                .limit(200)
//                .reduce(Integer::sum);
//        System.out.println(result.get());

        // * Пример 2
//        String[] strArr = new String[] {"aaa", "bb", "cccc", "bb", "cc", "zzzz"};
//        List<Integer> unique = Arrays
//                .stream(strArr)
//                .distinct()
//                .peek(System.out::println)
//                .map(String::length)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//        unique.forEach(System.out::println);

        // * Пример 3
        Integer [][] integers = new Integer[][] {{100, 200, 300}, {-10, -50}, {567, 900, 1045, 980}, {-100}};
        List<Integer> ints =
                Arrays.stream(integers)
                        .flatMap(Arrays::stream)
                        .sorted(Comparator.reverseOrder())
                        .peek(System.out::println)
                        .collect(Collectors.toList());



    }

}
