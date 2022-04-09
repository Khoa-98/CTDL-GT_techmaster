import static java.lang.Math.max;

public class Bai1299 {
    public static int[] replaceElements(int[] a) {

        int n = a.length;

        for (int i = a.length - 1; i >= 0; i--) {
            if (i != n - 1) {
                a[i] = (a[i] >= a[i + 1]) ? a[i] : a[i + 1];
            }
        }

        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        if (n > 0) {
            a[n - 1] = -1;
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] = {17,18,4,5,6,1};
        replaceElements(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
