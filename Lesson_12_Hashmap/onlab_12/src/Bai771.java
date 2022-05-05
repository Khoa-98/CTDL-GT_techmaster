import java.util.HashSet;
import java.util.Set;

public class Bai771 {
    public int numJewelsInStones(String a, String s) {
        Set<Character> set = new HashSet<>();
        for (char ch: a.toCharArray()) {
            set.add(ch);
        }
        int count =0;
        for (char ch:s.toCharArray()) {
            if(set.contains(ch) == true){
                count++;
            }
        }
        return count;
    }
}
