/**
 * b1: Duyệt mảng n2 sau đó dùng hàm chèn
 * phần tử của n2 vào n1 có sixe m, rồi tăng m lên 1
 * b2: xác định k mà n1[k] > x (n2)
 * - TH không có thì gán k = n1[m]
 * - TH có thì dịch từ n1[k] -> n1[m-1] sang phải
 * sau đó gán n1[k] = x
 */
public class Bai88_MergeSortedArray {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2) {
            chenPhantu(ai, n1, m);
            m++;
        }
    }

    private static void chenPhantu(int x, int[] a, int m) {
        boolean isCheck = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                isCheck = true;

                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if (isCheck == false) {
            a[m] = x;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {0, 3, 6};

        merge(n1, 4, n2, 3);
        System.out.println("done");


    }
}
