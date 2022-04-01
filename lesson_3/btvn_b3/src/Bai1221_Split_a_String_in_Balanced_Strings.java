public class Bai1221_Split_a_String_in_Balanced_Strings {

    public static int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                count++;
            } else if (arr[i] == 'L') {
                count--;
            }
            if (count == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRL";
        balancedStringSplit(s);
    }
}
