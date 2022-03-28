package pattern.singleton;

public class EnumDemo extends BaseClass {

    public static void main(String[] args) {
//        SingletonE singleton = SingletonE.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        printSingleton();

    }






}
