package generalizations.types_methods;
import generalizations.boxes.NumberBox;

public class MethodSandbox {

    public static void main(String[] args) {

        NumberBox<?> integerNumberBox = new NumberBox<>(1.0, 2.0, 30, 3.9f);
        System.out.println(getFirstValueFromBox(integerNumberBox)); // 10
    }


    public static <T extends Number> T getFirstValueFromBox(NumberBox <T> numberBox) {
        return numberBox.getNumbers()[0];
    }


}
