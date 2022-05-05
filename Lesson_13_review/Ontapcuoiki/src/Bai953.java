import java.util.Comparator;

public class Bai953 {
    // Cach 1: sd Camparator
    public boolean isAlienSorted(String[] words, String order) {
        Comparator<String> str = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int l1 = o1.length(), l2 = o2.length();
                for (int i = 0; i < Math.min(l1, l2); i++) {
                    int i1 = order.indexOf(o1.charAt(i));
                    int i2 = order.indexOf(o2.charAt(i));
                    if (i2 != i1) {
                        return i1 - i2;
                    }
                }
                return l1 - l2;
            }
        };
        for (int i = 1; i < words.length; i++) {
            if (str.compare(words[i], words[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    // cach 2: sd Map.
    public boolean isAlienSorted2(String[] words, String order) {


        return false;
    }
}
