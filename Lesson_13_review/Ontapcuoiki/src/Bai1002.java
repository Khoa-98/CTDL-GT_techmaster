import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai1002 {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (map.containsKey(c) && map.get(c) > 0) {
                    temp.put(c, temp.getOrDefault(c, 0) + 1);
                    map.put(c, map.get(c) - 1);
                }
            }
            map = temp;
            if (map.size() == 0) break;
        }
        List<String> listRes = new ArrayList<>();
        for (Character ch : map.keySet()) {
            for (int i = 0; i < map.get(ch); i++) {
                listRes.add("" + ch);
            }
        }

        return listRes;
    }
}
