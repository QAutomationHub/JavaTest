package generalizations.boxes;

public class Box {

    private Object obj;

    Box(Object obj) {
        this.obj = obj;
    }

    Object getObj() {
        return obj;
    }

    void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + getClass().getSimpleName() +
                "obj=" + obj +
                '}';
    }
}
