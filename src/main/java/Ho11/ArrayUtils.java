package Ho11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtils {

    public static <T> void replaceTwoElements(T[] arr, int i1, int i2) {
        T obj = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = obj;
    }

    public static <T> ArrayList<T> arrToList(T[] arr) {
        ArrayList<T> result = new ArrayList<>(arr.length);
        for (T t : arr) {
            result.add(t);
        }
        return result;
    }
}
