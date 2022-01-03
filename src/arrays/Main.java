package arrays;

public class Main {
    public static void main(String[] args) {
        long result = Arrays.getArraySum(new int[] {1, 2, 3, 4, 5});
        System.out.println(result);
        System.out.println(Arrays.getMaxHeightDifferenceV1(new int []{1, 2, 3, 4, 3, 2, 8, 7, 1}));
        System.out.println(Arrays.getMaxHeightDifferenceV2(new int []{1, 2, 3, 4, 3, 2, 8, 7, 1}));
        System.out.println(Arrays.getMaxRepeat(new int [] {1, 2, 3, 1, 1, 1, 1, 2, 2}));
    }
}
