import java.util.HashMap;
import java.util.Map;

public class Bai1160 {

    public Map<Character, Integer> buildMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public boolean isGood(String word, Map<Character, Integer> charsMap) {
        Map<Character, Integer> wordMap = buildMap(word);

        for (var row : wordMap.entrySet()) {
            int toiCo = charsMap.getOrDefault(row.getKey(), 0);
            if (row.getValue() > toiCo) {
                return false;
            }
        }

        return true;
    }

    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        Map<Character, Integer> charsMap = buildMap(chars);
        for (String word : words) {
            if (isGood(word, charsMap)) {
                sum += word.length();
            }
        }
        return sum;
    }
}
