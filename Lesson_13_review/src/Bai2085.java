import java.util.HashMap;
import java.util.Map;

public class Bai2085 {

    public int countWords(String[] words1, String[] words2) {
        int res = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        for (String key : map1.keySet()) {
            if (map2.getOrDefault(key, 0) == 1 && map1.get(key) == 1) {
                res++;
            }
        }
        return res;
    }
}
