/**
 * B1: tạo biến soDu = 1 sau đó cộng vào phần tử cuối cùng
 * của mảng a[]. soDu và a[i] được cập nhật lại
 * b2: tạo 1 mảng b để hứng lại mảng a[] và soDu trong Th
 * mảng a[] bị tràn
 */

public class Bai66_PlusOne {

    public static int[] plusOne(int[] a) {
        int n = a.length;
        int soDu = 1;

        int i = n - 1;  // vị trí cuối cùng của mảng a[]
        while (i >= 0 && soDu > 0) {
            int tem = a[i] + soDu; // 9+3 = 12, a[i] = 12 % 10 = 2, soDu = 12 /10 =1
            a[i] = tem % 10;
            soDu = tem / 10;
            i--;
        }
        if (soDu == 0) return a;

        // TH mảng a[] = {9,9....}
        int[] b = new int[n + 1]; // tao mảng B hứng các giá trị của mảng a và số dư
        b[0] = soDu; // gán số dư vào vị trí đầu tiên của b[]
        for (int j = 0; j < n; j++) {
            b[j + 1] = a[j]; // gán các ptu còn lại vào b[]
        }

        return b;
    }

    public static void main(String[] args) {
        int[] a = {9, 9, 9};
        int[] b = plusOne(a);
    }
}
