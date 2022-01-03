package generalizations.boxes;

public class NumberBox <N extends Number> {

    private N [] numbers;

    // ? VAR-ARGS
    public NumberBox(N... numbers) {
        this.numbers = numbers;
    }

    public N[] getNumbers() {
        return numbers;
    }

    public void setNumbers(N[] numbers) {
        this.numbers = numbers;
    }

    // * вычисляем среднее арифметическое
    public double avg() {
        double sum = 0;
        for (N number : numbers) {
            sum+= number.doubleValue();
        }
        return sum / numbers.length;
    }

    // * сравниваем среднее арифметическое коробок (<?> работаем с любыми числовыми типами)
    public boolean isSameAvg(NumberBox<?> other) {
        return Math.abs(this.avg() - other.avg()) < 0.0001;
    }



}
