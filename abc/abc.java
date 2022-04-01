/**
 * abc
 */
public class abc {

    public static int firstUniqChar(String s) {
        char[] cArr = s.toCharArray();
        int[] count = new int[123];

        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            int index = (int) c;
            count[index]++;
        }
        for (int i = 0; i < count.length; i++) {
            char c = cArr[i];
            int index = (int) c;
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar(s);
    }
}