package Ho11;
        import java.util.Arrays;
        import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("Array utils test.\n");

        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ArrayUtils.replaceTwoElements(ints, 2, 7);
        System.out.println(Arrays.toString(ints));

        List<Integer> list = ArrayUtils.arrToList(ints);
        System.out.println(list);

        System.out.println("\nFruits test\n");

        Box<Apple> appleBox1 = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );
        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < 500; i++) {
            appleBox2.add(new Apple());
        }

        Box<Orange> orangeBox1 = new Box<>(
                new Orange(),
                new Orange()
        );
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 500; i++) {
            orangeBox2.add(new Orange());
        }

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());
        System.out.println();

        System.out.println(appleBox1.compare(orangeBox1));

        orangeBox1.replaceAll(orangeBox2);
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());
    }

}
