import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bai268 {
    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int k = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            set.add(nums[i]);
        }
        for (k = 0; k <= count; k++) {
            if (set.contains(k) == false) {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
