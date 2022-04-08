public class Bai3_TinhTong_AdenB {
    public static int sum2(int a[], int start, int end) {
        if (start < 0 || end >= a.length || start >= end) {
            return 0;
        }

        return a[start] + sum2(a, start + 1, end);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum2(a, 2, 7));
        System.out.println(sum2(a, 2, 9));
    }
}
