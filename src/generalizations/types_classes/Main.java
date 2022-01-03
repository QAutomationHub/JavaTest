package generalizations.types_classes;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Cat cat = new Cat();

        // ! Ошибка, тип принимаемых данных обозначен сигнатурой класса "BirdHouse <T extends Animal & isFlying>"
//        BirdHouse <Cat> catHouse = new BirdHouse<>(cat);

        // * А так можно т.к. "Eagle extends Animal implements isFlying"
        BirdHouse <Eagle> eagleBirdHouse = new BirdHouse<>(eagle);
    }
}
