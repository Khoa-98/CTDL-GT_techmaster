import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1089 {

    //Cach 1:
    public static void duplicateZeros(int[] a) {
        int b[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && j < a.length) {
                b[j] = a[i];
                j++;
            }
            if (j >= a.length) {
                break;
            }
            b[j] = a[i];
            j++;
        }

        for (int k = 0; k < a.length; k++) {
            a[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 0, 2, 3};
        duplicateZeros(a);
        System.out.println(Arrays.toString(a));

    }

    //Cach 2:
    public void duplicateZeros2(int[] a) {
        List<Integer> L1 = new ArrayList<>();
        for (int in : a) {

            if (in == 0 && L1.size() < a.length) {
                L1.add(0);
                L1.add(0);
            } else if (L1.size() < a.length) {
                L1.add(in);
            }
        }
        for (int k = 0; k < a.length; k++) {
            a[k] = L1.get(k);
        }
    }
}
