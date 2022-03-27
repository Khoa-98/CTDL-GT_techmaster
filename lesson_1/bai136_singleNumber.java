/**
 * bai136_singleNumber
 */
public class bai136_singleNumber {

    public int singleNumber(int[] a) {
        int result = a[0];
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        bai136_singleNumber test1 = new bai136_singleNumber();
        int nums1[] = { 2, 2, 4, 5 };
        System.out.println(test1.singleNumber(nums1));
    }
}