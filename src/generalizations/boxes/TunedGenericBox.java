package generalizations.boxes;

public class TunedGenericBox <T, U> {

    private T obj1;
    private U obj2;

    public TunedGenericBox (T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "\n type = " + getClass().getSimpleName() +
                "\n obj1 = " + obj1 +
                "\n obj2 = " + obj2 +
                '}';
    }

}
