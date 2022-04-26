import java.util.Stack;

public class Bai1544 {

    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (stk.isEmpty()) {
                stk.push(ch);
            } else if (stk.peek() == (ch + 32) || stk.peek() == ch - 32) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }
        String str = "";
        while (!stk.isEmpty()) {
            str = stk.pop() + str;
        }

        return str;
    }
}
