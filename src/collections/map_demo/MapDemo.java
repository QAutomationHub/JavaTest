package collections.map_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> daysOfWeek = new HashMap<>();
        daysOfWeek.put("Понедельник", 1);
        daysOfWeek.put("Вторник", 2);
        daysOfWeek.put("Среда", 3);
        daysOfWeek.put("Четверг", 4);
        daysOfWeek.put("Пятница", 5);
        daysOfWeek.put("Суббота", 6);
        daysOfWeek.put("Воскресенье", 7);

        System.out.println(daysOfWeek.containsKey("Понедельник")); // true - содержится
        System.out.println(daysOfWeek.containsKey("Понебота")); // false - не содержится
        System.out.println(daysOfWeek.get("Вторник")); // 2 - вернет ключ
        System.out.println(daysOfWeek.size()); // 7 - количество значений
        System.out.println(daysOfWeek.isEmpty()); // false - пустой ли словарь
        System.out.println(daysOfWeek.containsValue(8)); // false - ключа 8 нет

        // * Итерируем
        Set<String> keys = daysOfWeek.keySet();
        keys.forEach(System.out::println);

        // * iterator
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
