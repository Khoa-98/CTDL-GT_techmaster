import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * bai001
 */
public class bai001 {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        bai001 test = new bai001();
        int[] nums1 = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(test.twoSum(nums1, 5)));
    }
}


