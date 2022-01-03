package cycles;

public class Cycles {

    // * ()(())((()))(((()))) n = 4

    public static void printBracketsSequence(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("(");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(")");
            }
        }
    }

    // * ()(())((()))((...... вывести первые N скобок
    public static void printFirstNBrackets(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("param n should be positive, but now n = " + n);
        }

        int begin = 1;

        while (true) {
            for (int i = 0; i < begin; i++) {
                System.out.print("(");
                n--;
                if (n == 0) {
                    return;
                }
            }
            for (int i = 0; i < begin; i++) {
                System.out.print(")");
                n--;
                if (n == 0) {
                    return;
                }
            }
            begin++;
        }
    }


    // * Итерация по массиву strings
    public static void printArray(String [] array) {

        // * способ 1
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        // * способ 2
        for (String s : array) {
            System.out.print(s);
        }
    }




}
