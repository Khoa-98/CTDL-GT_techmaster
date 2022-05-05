import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Bai890 {

    /**
     * @param word
     * @param pattern
     * @return true
     */
    public boolean isMatchString(String word, String pattern) {
        if (word.length() != pattern.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> setValue = new HashSet<>(); // chứa các value của map

        char[] charPattern = pattern.toCharArray(); // them vào key của map
        char[] charWord = word.toCharArray(); // them vào value của map

        for (int i = 0; i < charPattern.length; i++) {
            Character ch = map.get(charPattern[i]);
            // neu value cua ch chua co gia tri thi put vao map va set
            if (ch == null) {
                // nếu 2 key khác nhau có value giống nhau thì false
                if (setValue.contains(charWord[i])) {
                    return false;
                }
                map.put(charPattern[i], charWord[i]);
                setValue.add(charWord[i]);
            } else if (charWord[i] != ch) { // neu tai key: ch,  co value roi, thi ktra xem có giong với charWord[i] ko?
                return false;
            }
        }

        return true;
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> listRes = new ArrayList<>();

        for (String word : words) {
            if (isMatchString(word, pattern)) {
                listRes.add(word);
            }
        }
        return listRes;
    }
}
