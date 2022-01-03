package generalizations.boxes;

public class GenericBox <T> {

    private T obj;

    GenericBox (T obj) {
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }

    void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "type=" + getClass().getSimpleName() +
                "obj=" + obj +
                '}';
    }
}
