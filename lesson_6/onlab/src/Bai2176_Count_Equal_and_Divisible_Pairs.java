public class Bai2176_Count_Equal_and_Divisible_Pairs {

    public static int countPairs(int[] a, int k) {
        int kq = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i * j) % k == 0) {
                    kq++;
                }
            }
        }
        return kq;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 2, 2, 1, 3};
        int[] b = {3, 1, 1, 1, 2, 3};
        countPairs(a, 2);
    }
}
