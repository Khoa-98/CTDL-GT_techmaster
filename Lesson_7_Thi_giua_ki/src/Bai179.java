import java.util.Arrays;
import java.util.Comparator;

public class Bai179 {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        if (arr[0].equals("0")) return "0";

        StringBuilder str = new StringBuilder();
        for (String s : arr) {
            str.append(s);
        }

        return str.toString();
    }
}
