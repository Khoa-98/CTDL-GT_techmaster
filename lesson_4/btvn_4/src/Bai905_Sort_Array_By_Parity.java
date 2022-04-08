public class Bai905_Sort_Array_By_Parity {

    public static int[] sortArrayByParity(int[] a) {
        int n = a.length;
        int result[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                result[k++] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1) {
                result[k++] = a[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2};
        sortArrayByParity(a);
    }
}
