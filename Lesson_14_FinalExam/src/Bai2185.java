public class Bai2185 {
    public static boolean isMatch(String s, String pref) {
        if (pref.length() > s.length()) return false;
        for (int i = 0; i < pref.length(); i++) {

            if (pref.charAt(i) != s.charAt(i)) {
                return false;
            }

        }
        return true;
    }


    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (isMatch(word, pref)) {
                res++;
            }
        }
        return res;
    }
}
