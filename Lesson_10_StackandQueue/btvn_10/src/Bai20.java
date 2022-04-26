import java.util.Stack;

public class Bai20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.isEmpty()) {
                st.push(ch);
            } else if (st.peek() == ch - 1 || st.peek() == ch - 2) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
//        String str = "";
//        while (!st.isEmpty()) {
//            str = st.pop() + str;
//        }
//
//        if (str.equals("")) {
//            return true;
//        }
        return st.isEmpty();
    }
}
