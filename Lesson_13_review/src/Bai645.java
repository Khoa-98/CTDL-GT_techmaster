import java.util.HashSet;
import java.util.Set;

public class Bai645 {
    public int[] findErrorNums(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];

        for (int x : nums) {
            if (set.add(x) == false) {
                res[0] = x;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (set.contains(i) == false) {
                res[1] = i;
            }
        }
        return res;
    }
}
