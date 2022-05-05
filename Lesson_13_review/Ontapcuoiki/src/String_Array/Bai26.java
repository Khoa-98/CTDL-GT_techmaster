package String_Array;

import java.util.HashSet;
import java.util.Set;

public class Bai26 {
    public static  int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count =0;
        for (int num : nums) {
            if(set.add(num))
                nums[count++] = num;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }
}
