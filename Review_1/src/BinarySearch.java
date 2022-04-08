public class BinarySearch {

    public static int timKiemNhiPhan(int[] a, int x) {
        int L = 0;
        int R = a.length - 1;
        int midIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (R >= L) {
                midIndex = (R + L) / 2;
            }
            if (a[midIndex] > x) {
                R = midIndex - 1;
            } else if (a[midIndex] < x) {
                L = midIndex + 1;
            } else {
                return midIndex;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(timKiemNhiPhan(a, 5));
    }
}
