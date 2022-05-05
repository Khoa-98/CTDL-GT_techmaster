package String_Array;

import java.util.*;

public class Bai448 {
    // cah 1 sd set
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> listRes = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        Arrays.sort(nums);
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                listRes.add(i + 1);
            }
        }
        return listRes;
    }

    // cach 2 : su dung mang dem
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> listRes = new ArrayList<>();
        int count[] = new int[nums.length];

        for (int num : nums) {
            count[num - 1]++; // num-1 vì index 1 mang từ 0->length-1, mà input bài có range : (1->n)
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                listRes.add(i + 1); // i+1 vì: lý do giống bên trên
            }
        }
        return listRes;
    }
}
