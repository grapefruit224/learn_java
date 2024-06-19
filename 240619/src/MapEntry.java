import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Map.Entry;

public class MapEntry {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        map.put("A", list1);


        Set<Entry<String, List<String>>> entries = map.entrySet();

        for (Entry<String, List<String>> entry : entries) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}