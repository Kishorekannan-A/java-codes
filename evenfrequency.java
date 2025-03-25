import java.util.*;

public class evenfrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 3, 3, 4, 4, 4, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        for (Integer i : list) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
