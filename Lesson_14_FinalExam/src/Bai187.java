import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Bai187 {
    public static  List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();


        if (s.length() <= 10 || s == null)
            return new ArrayList<>();

        int start = 0;
        int end = 10;
        while (end <= s.length()) {
            String subString = s.substring(start, end);
            if (map.containsKey(subString)) {
                map.put(subString, map.get(subString) + 1);
            } else {
                map.put(subString, 1);
            }
            start++;
            end++;
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                res.add(key);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "AAAAAAAA";
        String s2 = "";
        String s3 = "AAAAAAAACCCCCCCCCCC";
        System.out.println(findRepeatedDnaSequences(s1));
        System.out.println(findRepeatedDnaSequences(s2));

    }
}
