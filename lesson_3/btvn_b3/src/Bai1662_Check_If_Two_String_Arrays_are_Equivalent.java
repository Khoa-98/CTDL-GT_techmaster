public class Bai1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        arrayStringsAreEqual(word1, word2);
        arrayStringsAreEqual2(word1, word2);
        System.out.println("done");
    }

    // C1
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i]; // gán từng ptu của mảng word1 vào cuối chuỗi str1
        }
        for (int j = 0; j < word2.length; j++) {
            str2 += word2[j];
        }
        if (str1.equals(str2)) { // so sánh nội dung của 2 chuỗi
            return true;
        }

        return false;
    }

    // c2:
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder stb1 = new StringBuilder();
        StringBuilder stb2 = new StringBuilder();

        for (String w : word1) {
            stb1.append(w); // append() nối thêm chuỗi được chỉ định vào chuỗi
        }
        for (String w : word2) {
            stb2.append(w);
        }
        if (stb1.toString().equals(stb2.toString())) {
            return true;
        }

        return false;
    }

}
