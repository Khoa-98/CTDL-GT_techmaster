import java.util.LinkedList;
import java.util.Queue;

public class Bai933 {
    Queue<Integer> pi = new LinkedList<>();
    public Bai933() {

    }

    public int ping(int t) {


        pi.add(t);
        int min = t -3000;
        while (pi.peek() < min) {
            pi.poll();
        }
        return pi.size();
    }
}
