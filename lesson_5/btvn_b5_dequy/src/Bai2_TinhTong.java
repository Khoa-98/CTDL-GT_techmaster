public class Bai2_TinhTong {
    public static int sum(int a[], int k) {
        if (k >= a.length) {
            return 0;
        }

        return a[k] + sum(a, k + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(a, 5));
    }
}
