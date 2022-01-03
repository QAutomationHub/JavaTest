package generalizations.boxes;

public class Main {

    public static void main(String[] args) {

        // * Box

//        Box integerBox1 = new Box(100);
//        Box integerBox2 = new Box(200);
//
//        integerBox1.setObj("Записываем в переменную integerBox1 типа Object эту строку");
//
//        if (integerBox1.getObj() instanceof Integer && integerBox2.getObj() instanceof Integer) {
//            int sumIntegerBox = ((Integer) integerBox1.getObj()) + ((Integer) integerBox2.getObj());
//            System.out.println(sumIntegerBox);
//        }

        // ? ------------------------------------------------------------------------------------------

        // * GenericBox

//        GenericBox <Integer> integerGenericBox1 = new GenericBox<>(100);
//        GenericBox <Integer> integerGenericBox2 = new GenericBox<>(200);
//
//        int sumIntegerGeneticBox = integerGenericBox1.getObj() + integerGenericBox2.getObj();
//        System.out.println(sumIntegerGeneticBox);

        // ? ------------------------------------------------------------------------------------------

        // * TunedGenericBox

//        TunedGenericBox <Integer, String> russianPopulation = new TunedGenericBox<>(145_000_000, "Население РФ");
//        System.out.println(russianPopulation.getObj1());
//        System.out.println(russianPopulation.getObj2());
//        System.out.println(russianPopulation);

        // ? ------------------------------------------------------------------------------------------

        // * NumberBox

//        NumberBox <Integer> intBox = new NumberBox<>(0, 50);
//        System.out.println(intBox.avg());
//        NumberBox <Integer> otherBox = new NumberBox<>(0, 0, 75);
//        System.out.println(otherBox.avg());
//
//        System.out.println(intBox.isSameAvg(otherBox));
//
//        NumberBox<Double> doubleNumberBox = new NumberBox<>(0.0, 0.0, 75.0);
//
//        System.out.println(intBox.isSameAvg(doubleNumberBox));

    }
}
