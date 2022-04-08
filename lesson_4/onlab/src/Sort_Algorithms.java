import java.util.Arrays;

public class Sort_Algorithms {
    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                printArray(j, a);

            }
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            //chen a[i] vao day o-> i-1
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 2, 7, 8, 1, 2};
//        bubbleSort(a);
        insertionSort(a);
    }
}
