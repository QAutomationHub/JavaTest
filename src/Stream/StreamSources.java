package Stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// источники стримов
public class StreamSources {

    public static void main(String[] args) {

        // 1 - набор произвольных данных
        Stream.of("My name is Vasya", 15, null, new Object());

        // 2 - стримы из классов оберток
        IntStream.of(1, 2, 3, 4, 5);
        DoubleStream.of(1.0, 2.0, 3.0, 4.0);
        LongStream.of(1L, 2L, 3L, 4L);

        // 3 - из массивов
        String [] strArr = new String[] {"a", "b", "c"};
        Arrays.stream(strArr);

        // 4 - конечная последовательность в диапазоне
        IntStream.range(0, 11); // не включительно
        IntStream.rangeClosed(0, 10); // включительно

        // 5 - бесконечная последовательность
        Stream.iterate(5, x -> x + 5);

        // 6 - генератор
        Stream.generate(Math::random);

        // для случайных чисел



    }



}
