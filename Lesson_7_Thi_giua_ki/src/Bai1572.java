public class Bai1572 {
    public static int diagonalSum(int[][] a) {
        int n = a.length;
        int j = n - 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i][i] + a[i][j];
            j--;
        }
        if (n / 2 == 1) {
            sum = sum - a[n / 2][n / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(a));
    }
}
