package arrays;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        // * сумма массива
        long result = ArraysMethods.getArraySum(new int[] {1, 2, 3, 4, 5});
        System.out.println(result);

        // * у массива [1, 2, 3, 4, 3, 2, 8, 7, 1] найти максимальное изменение высоты между соседями (вариант 1)
        System.out.println(ArraysMethods.getMaxHeightDifferenceV1(new int []{1, 2, 3, 4, 3, 2, 8, 7, 1}));

        // * у массива [1, 2, 3, 4, 3, 2, 8, 7, 1] найти максимальное изменение высоты между соседями (вариант 2)
        System.out.println(ArraysMethods.getMaxHeightDifferenceV2(new int []{1, 2, 3, 4, 3, 2, 8, 7, 1}));

        // * у массива [1, 2, 3, 1, 1, 1, 1, 2, 2] найти максимальное количество повторов
        System.out.println(ArraysMethods.getMaxRepeat(new int [] {1, 2, 3, 1, 1, 1, 1, 2, 2}));

        // * меняем местами по индексу
        Object [] array = new Object[] {1, 2, 3, 4, 5};
        ArraysMethods.swap(array, 0, 1);
        System.out.println(Arrays.deepToString(array));

    }
}
