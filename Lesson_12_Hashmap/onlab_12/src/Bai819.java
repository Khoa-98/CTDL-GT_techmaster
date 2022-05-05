import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bai819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] para = paragraph.toLowerCase().split("[ !?',;.]+");
        Map<String, Integer> map = new HashMap<>();
        Set<String> blackList = new HashSet<>();

        for (String s : banned) {
            blackList.add(s);
        }
        int max = 0;
        for (String s : para) {
            if (!blackList.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
                max = Math.max(max, map.get(s));
            }
        }
        String result = "";
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                result = s;
            }
        }

        return result;
    }
}
