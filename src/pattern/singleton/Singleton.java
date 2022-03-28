package pattern.singleton;


//! Этот паттерн гарантирует, что у класса есть только один объект (один экземпляр класса) и к этому объекту предоставляется глобальная точка доступа
//? Поведение Одиночки на Java невозможно реализовать с помощью обычного конструктора, потому что конструктор всегда возвращает новый объект.
//? Поэтому все реализации Singleton’a сводятся к тому, чтобы скрыть конструктор и создать публичный статический метод, который будет управлять
//? существованием объекта-одиночки и «уничтожать» всех вновь-появляющихся объектов. В случае вызова Singleton’a он должен либо создать новый объект
//? (если его еще нет в программе), либо вернуть уже созданный. Для этого:

//! Вариант 1
public class Singleton {

    // * Нужно добавить в класс приватное статическое поле, содержащее одиночный объект
    private static Singleton instance;

   // * Сделать конструктор класса (конструктор по-умолчанию) приватным (чтобы доступ к нему
   // * был закрыть за пределами класса, тогда он не сможет возвращать новые объекты)
    private Singleton () {}

    // * Объявить статический создающий метод, который будет использоваться для получения одиночки
    public static Singleton getInstance(){
        if(instance == null) {		//если объект еще не создан
            instance = new Singleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }

    //? Минусы:
    //? 1. не работает в многопоточной среде

 //! Вариант 2
/*
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
*/
//? Минусы:
    //? 1. Объект instance будет создан classloader-ом во время инициализации класса
    //? 2. Отсутствует возможность обработки exceptions во время вызова конструктора

//! Вариант 3 (Использование внутреннего класса, метод Била Пью)
/*
    private Singleton(){}

    private static class SingletonHolder {
    private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
 */

//? Минусы:
    //? 1. Отсутствует возможность обработки exceptions во время вызова конструктора

//! Вариант 4 (Синхронизация)
/*
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
*/
//? Минусы:
    //? 1. Синхронизация полезна только один раз, при первом обращении к getInstance(),
    //? после этого каждый раз, при обращении этому методу, синхронизация просто забирает время
}

