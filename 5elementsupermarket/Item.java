import java.io.Serializable;

public abstract class Item implements Serializable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract String toString(); // Abstract method for subclasses to implement
}