package arrays;

public class ArraysMethods {

    // * сумма массива
    public static long getArraySum(int[] array) {
        long sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;

    }

    // * у массива [1, 2, 3, 4, 3, 2, 8, 7, 1] найти максимальное изменение высоты между соседями
    // * вариант 1
    public static int getMaxHeightDifferenceV1(int[] heights) {
        int maxDifference = 0;
        int difference = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] > heights[i + 1]) {
                difference = heights[i] - heights[i + 1];

            } else {
                difference = heights[i + 1] - heights[i];
            }
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        return maxDifference;
    }

    // * вариант 2
    public static int getMaxHeightDifferenceV2(int[] heights) {
        int maxDifference = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            maxDifference = Math.max(
                    maxDifference,
                    Math.abs(heights[i] - heights[i + 1])
            );
        }
        return maxDifference;
    }

    // * у массива [1, 2, 3, 1, 1, 1, 1, 2, 2] найти максимальное количество повторов

    public static int getMaxRepeat(int[] array) {
        int cnt = 1;
        int maxRepeat = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                cnt++;
                maxRepeat = Math.max(cnt, maxRepeat);
            } else {
                cnt = 1;
            }
        }
        return maxRepeat;
    }

    // * меняем местами по индексу
    public static void swap(Object[] array, int index1, int index2) {
        Object buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }


}
