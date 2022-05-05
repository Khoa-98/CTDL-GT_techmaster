import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static int convertStringToInt(String s){
        char[] arr = s.toCharArray();
        String str = "";
        for (char ch: arr) {
            int x = ch -'a' + 1;
            String xString = String.valueOf(x);
            str += xString;
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String[] strInputArr = { "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "bb", "ccc", "az" };
        int [] convertedInput = new int[strInputArr.length];

        for (int i = 0; i < strInputArr.length; i++) {
            convertedInput[i] = convertStringToInt(strInputArr[i]);
        }
        // { "aaa", "bb", "ccc" } => { 111, 22, 333, 126}

        String[] strCheck = {"aaa", "abc"};
        int [] convertedCheck = new int[strCheck.length];

        for (int i = 0; i < strCheck.length; i++) {
            convertedCheck[i] = convertStringToInt(strCheck[i]);
        }
        // { "aaa", "abf" } => {111, 126}
        List<String>[] existArr = new ArrayList[1000];
        for (int i = 0; i < convertedInput.length; i++) {
            // nhay den List tai index
            if(existArr[convertedInput[i]] == null){
                existArr[convertedInput[i]] = new ArrayList<>();
            }
            // nhet no vao list
            existArr[convertedInput[i]].add(strInputArr[i]);
        }
        // B2: true- false
        for (int i = 0; i < convertedCheck.length; i++) {
            // 1.nhay dden ô 111
            List<String> list = existArr[convertedCheck[i]];
            // 2. Kiem tra trong list co 'aaa' hay khong
            boolean isFound = false;
            // aaa => strCheck[i]
            for (String str: list) {
                if(str.equals(strCheck[i])){
                    isFound = true;
                    break;
                }
            }
            System.out.println(isFound ? true : false);
        }
    }
}
