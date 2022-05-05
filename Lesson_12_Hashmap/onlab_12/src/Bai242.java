import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bai242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> tMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (!tMap.containsKey(ch) || tMap.get(ch) == 0) return false;
            tMap.put(ch, tMap.get(ch) - 1);
        }

        return true;
    }

    // Cach 2:
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
