import java.util.Arrays;

public class Bai414_Third_Maximum_Number {
    public static int thirdMax(int[] a) {
        Arrays.sort(a);
        int max = 10001;
        int count = 0;
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < max) {
                max = a[i];
                count++;
            }
            if (count == 3) {
                return max;
            }
        }

        return a[n - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 3, 1};
        thirdMax(a);
    }
}
