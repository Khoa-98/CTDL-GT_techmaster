import java.util.ArrayList;
import java.util.List;

public class Bai1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> listRes = new ArrayList<>();

        int m = matrix.length; // so hang
        int n = matrix[0].length;// so cot

        for (int i = 0; i < m; i++) { // duyet hang
            int coloumIndex = 0;
            int min = Integer.MAX_VALUE;
            // duyet cot de tim min trong 1 hang
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    coloumIndex = j;  // Sau khi tim duoc min cua hang thi luu lai index cua cot
                }
            }
            int max = Integer.MIN_VALUE;
            // duyet hang voi cot la chi so index cua cot co chua min trong hang
            for (int j = 0; j < m; j++) {
                if (max < matrix[j][coloumIndex]) { // tim max trong cot ma co min cua hang
                    max = matrix[j][coloumIndex];
                }
            }
            if (min == max) {
                listRes.add(min);
            }
        }

        return listRes;
    }
}
