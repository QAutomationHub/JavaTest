package pattern.singleton;

public abstract class BaseClass {

    public static SingletonE singleton = SingletonE.INSTANCE;

    public static void printSingleton() {
        System.out.println(Singleton.getInstance());
    }

}
