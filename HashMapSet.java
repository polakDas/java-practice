import java.util.HashMap;
import java.util.Map;

public class HashMapSet {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();

        nameAge.put("Inayya", 4);
        nameAge.put("Rowza", 5);

        System.out.println(nameAge.keySet());
        System.out.println(nameAge.values());

        // loop
        nameAge.forEach((k, v) -> System.out.println(k + ", age = " + v));

        for (Map.Entry<String, Integer> kv : nameAge.entrySet()) {
            System.out.println(kv.getKey() + ", age = " + kv.getValue());
        }
    }
}
