import java.util.Stack;

public class Bai844 {
    public static String removeBackspace(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                if (st.isEmpty()) {
                    st.push(ch);
                }
                st.pop();
            } else {
                st.push(ch);
            }
        }
        String str = "";
        while (!st.isEmpty()) {
            str = st.pop() + str;
        }

        return str;
    }

    public boolean backspaceCompare(String s, String t) {
        return removeBackspace(s).equals(removeBackspace(t));
    }
}
