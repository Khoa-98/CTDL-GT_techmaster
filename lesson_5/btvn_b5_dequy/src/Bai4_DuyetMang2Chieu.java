public class Bai4_DuyetMang2Chieu {
    public static void mang2Chieu(int[][] a, int i, int j) {
        if (i < a.length) {
            if (j < a[0].length - 1) {
                System.out.print("[" + i + "," + j + "]" + " ");
                mang2Chieu(a, i, j + 1);
                return;
            }
            System.out.println("[" + i + "," + j + "]");
            mang2Chieu(a, i + 1, j = 0);
        }
    }

    public static void print(int[][] a) {
        mang2Chieu(a, 0, 0);
    }

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        print(a);
    }
}
