import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai2068 {

    public static Map<Character, Integer> buildMap(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character, Integer> map1 = buildMap(word1);
        Map<Character, Integer> map2 = buildMap(word2);


        for (Character key : map1.keySet()) {
            if (Math.abs(map1.get(key) - map2.getOrDefault(key, 0)) > 3) {
                return false;
            }
        }
        for (Character key : map2.keySet()) {
            if (Math.abs(map2.get(key) - map1.getOrDefault(key, 0)) > 3) {
                return false;
            }
        }

        return true;
    }
}
