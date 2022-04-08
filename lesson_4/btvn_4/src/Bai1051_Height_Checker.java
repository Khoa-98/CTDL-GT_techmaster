import java.util.Arrays;

public class Bai1051_Height_Checker {
    public static int heightChecker(int[] a) {
        int k = 0;
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                k++;
            }
        }


        return k;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 4, 2, 1, 3, 1, 2};
        heightChecker(a);
    }
}
