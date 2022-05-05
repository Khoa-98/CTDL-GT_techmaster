import java.util.*;

public class Bai2032 {
    public static Map<Integer, Integer> builMap(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int in : a) {
            map.put(in, map.getOrDefault(in, 0) + 1);
        }
        return map;
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> listRes = new ArrayList<>();


        Map<Integer, Integer> map1 = builMap(nums1);
        Map<Integer, Integer> map2 = builMap(nums2);
        Map<Integer, Integer> map3 = builMap(nums3);

        Set<Integer> set = new HashSet<>();
        for (Integer map : map1.keySet()) {
            if (map2.containsKey(map) || map3.containsKey(map)) {
                set.add(map);
            }
        }
        for (Integer map : map2.keySet()) {
            if (map3.containsKey(map)) {
                set.add(map);
            }
        }
        for (int in : set) {
            listRes.add(in);
        }
        return listRes;
    }
}
