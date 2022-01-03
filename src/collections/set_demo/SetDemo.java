package collections.set_demo;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        // * Отсортирует по Hash
//        Set<Vehicle> vehicles = new HashSet<>();

        // * Добавит в порядке добавления
//        Set<Vehicle> vehicles = new LinkedHashSet<>();

        // * Можем отсортировать сами, переопределив метод "compare", экземпляры у которых скорость одинакова, будут удалены

        Comparator<Vehicle> speedComparator = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle vehicle, Vehicle t1) {
                return vehicle.maxSpeed - t1.maxSpeed;
            }
        };

        Set<Vehicle> vehicles = new TreeSet<>(speedComparator);


        Vehicle car1 = new Car("AB003", 50);
        Vehicle car2 = new Car("AB034", 60);
        Vehicle bike1 = new Bike("00AB", 25);
        Vehicle bike2 = new Bike("00ooL", 25);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(bike2);

        System.out.println(vehicles);
    }

}
