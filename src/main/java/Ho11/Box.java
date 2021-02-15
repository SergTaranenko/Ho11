package Ho11;

        import java.util.Arrays;
        import java.util.Collection;
        import java.util.LinkedList;

public class Box<T extends Fruit> {

    LinkedList<T> fruits;

    public Box() {
        this.fruits = new LinkedList<>();
    }

    public Box(Collection<T> fruits) {
        this.fruits = new LinkedList<>(fruits);
    }

    public Box(T... fruits) {
        this.fruits = new LinkedList<>(Arrays.asList(fruits));
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void replaceAll(Box<T> other) {
        other.getFruits().addAll(fruits);
        fruits.clear();
    }

    public double getWeight() {
        if (fruits.size() == 0) return 0;
        return fruits.size() * fruits.get(0).getWEIGHT();
    }

    public boolean compare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.001;
    }

    public LinkedList<T> getFruits() {
        return fruits;
    }
}
