import java.util.Stack;

public class Bai155_MinStack {
    private Stack<Integer> myStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public Bai155_MinStack() {

    }

    public void push(int val) {
        myStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        myStack.pop();
        minStack.pop();
    }

    public int top() {
        return myStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
