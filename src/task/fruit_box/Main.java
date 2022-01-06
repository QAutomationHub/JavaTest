package task.fruit_box;

import java.util.ArrayList;

public class Main {
    /*
    Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

    Для хранения фруктов внутри коробки можно использовать ArrayList;

    Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    Не забываем про метод добавления фрукта в коробку.
    */

    public static void main(String[] args) {

        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(1.3f));
        appleList.add(new Apple(1.2f));
        appleList.add(new Apple(2));


        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(new Orange(1));
        orangeList.add(new Orange(1.5f));
        orangeList.add(new Orange(2));

        Box appleBox = new Box(appleList);
        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight());
        Box orangeBox = new Box(orangeList);
        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
        appleBox.addFruit(new Apple(1));
        System.out.println(appleBox.compare(orangeBox));

        appleList.forEach(System.out::println);
        appleBox.pourOver(orangeBox);
        appleList.forEach(System.out::println);
    }
}
