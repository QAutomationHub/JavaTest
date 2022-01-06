package task.fruit_box;

import java.util.ArrayList;
import java.util.Arrays;

class Box<T extends Fruit> {

    private ArrayList<T> fruitList;

    Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    Box(T... fruitList) {
        this.fruitList = (ArrayList<T>) Arrays.asList(fruitList);
    }


    ArrayList<T> getFruitList() {
        return fruitList;
    }

    void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    // * Считаем общий вес фруктов в коробке
    float getWeight() {
        if (fruitList.size() != 0) {
            float result = 0;
            for (T fruits : fruitList) {
                result = fruits.getWeight() + result;
            }
            return result;
        } else {
            return 0;
        }
    }

    // * Сравниваем вес фруктов в коробках
    boolean compare (Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    // * Пересыпаем фрукты из коробки в коробку
    void pourOver(Box<T> box) {
        if(this != box && this != null) {
            box.getFruitList().addAll(fruitList);
            fruitList.clear();
        } else {
            System.out.println("Нельзя пересыпать фрукты в ту же коробку");
        }
    }

    // * Добавляем фрукт в коробку
    void addFruit (T fruit) {
        fruitList.add(fruit);
    }

}
