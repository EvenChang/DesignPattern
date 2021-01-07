import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> even = new HashMap<>();
        even.put(1, 2);
        even.put(2, 3);
        System.out.println(even);
        even.compute(2, (key, value) -> {
            if (key == 2) {
                return null;
            }

            return value;
        });
        System.out.println(even);

    }
}
