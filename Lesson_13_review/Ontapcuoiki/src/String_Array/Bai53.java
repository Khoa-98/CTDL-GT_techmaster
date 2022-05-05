package String_Array;

public class Bai53 {
    public int maxSubArray(int[] a) {
        int res = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < 0) {
                max = a[i];
            } else {
                max += a[i];
            }
            if (res < max) {
                res = max;
            }
        }
        return res;
    }
}
