import java.util.HashSet;
import java.util.Set;

public record Bai1_twoSum() {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> setArr = new HashSet<Integer>();

        int i, j;
        for (i = 0; i < nums.length; i++) {
            if (setArr.contains(target - nums[i])) {
                // check whether a pair exist
                break;
            }
            setArr.add(nums[i]); // if not exist , keep forwarding
        }
        for (j = 0; j < i; j++) {
            if (nums[j] == target - nums[i]) ;
            break;
        }
        int[] result = new int[2];
        result[0] = i;
        result[1] = j;

        return result;
    }
}
