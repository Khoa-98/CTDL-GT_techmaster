import java.util.HashMap;
import java.util.Map;

public class Bai205 {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> charMap = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (charMap.containsKey(chS)) {
                if (charMap.get(chS) != chT) {
                    return false;
                }
            } else {
                if (charMap.containsValue(chT)) {
                    return false;
                } else {
                    charMap.put(chS, chT);
                }
            }
        }
        return true;
    }
}
