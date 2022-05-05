import java.util.*;

public class Bai884 {


    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] sArr1 = s1.split(" ");
        String[] sArr2 = s2.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String str : sArr1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str : sArr2) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }


        List<String> listRes = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                listRes.add(key);
            }
        }
        String[] res = new String[listRes.size()];
        int k = 0;
        for (String list : listRes) {
            res[k++] = list;
        }

        return res;
    }

    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));

    }
}
