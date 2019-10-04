package map;

import java.util.Objects;

public class MyObject {

    private int x;
    private int y;
    private String name;

    public MyObject(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return x == myObject.x &&
                y == myObject.y &&
                name.equals(myObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, name);
    }
}
