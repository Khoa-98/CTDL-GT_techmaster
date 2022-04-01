public class Bai387_First_Unique_CharacterinaString {

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c; // convert từng kí tự trong arr[i] thành số thập phân
            count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 1) {
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
