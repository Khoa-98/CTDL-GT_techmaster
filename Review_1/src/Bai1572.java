public class Bai1572 {

    public int diagonalSum(int[][] mat) {
        int sum = 0, j = mat.length - 1;
        // tinh tong duong cheo chinh và duong cheo phu 
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i] + mat[i][j];
            j--;
        }
        if (mat.length % 2 == 1) {
            sum = sum - mat[mat.length / 2][mat.length / 2];
        }

        return sum;
    }
}
