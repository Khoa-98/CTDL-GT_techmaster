import java.util.ArrayList;
import java.util.List;

public class Bai500 {

    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count1 = 0, count2 = 0, count3 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (s1.contains(String.valueOf(words[i].charAt(j)))) {
                    count1++;
                }
                if (s2.contains(String.valueOf(words[i].charAt(j)))) {
                    count2++;
                }
                if (s3.contains(String.valueOf(words[i].charAt(j)))) {
                    count3++;
                }

            }
            if (count1 == words[i].length() || count2 == words[i].length() || count3 == words[i].length()) {
                list.add(words[i]);
            }
        }
        String[] result = new String[list.size()];
        list.toArray(result);
        return result;
    }
}
