import java.util.*;

public class Bai1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Arrays.sort(arr1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int in : arr1) {
            map.put(in, map.getOrDefault(in, 0) + 1);
        }

        List<Integer> listRes = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                for (int j = 0; j < map.get(arr2[i]); j++) {
                    listRes.add(arr2[i] );
                }
                map.put(arr2[i], 0);
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i]) && map.get(arr1[i]) > 0) {
                for (int j = 0; j < map.get(arr1[i]); j++) {
                    listRes.add(arr1[i]);
                }
                map.put(arr1[i], 0);
            }
        }

        int k = 0;
        for (int list : listRes) {
            res[k++] = list;
        }

        return res;
    }
}
