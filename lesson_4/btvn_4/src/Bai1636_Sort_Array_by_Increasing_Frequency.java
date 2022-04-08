import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1636_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int a[] = {-1, -1, 1, 2};
        frequencySort(a);
    }

    public static int[] frequencySort(int[] a) {
        int[] kq = new int[a.length];
        int[] k = new int[201];

        for (int i = 0; i < a.length; i++) {
            k[a[i] + 100]++;
        }
        List<MyNumber> myList = new ArrayList<>();
        for (int i = 0; i < k.length; i++) {
            if (k[i] != 0) {
                MyNumber x = new MyNumber();
                x.value = i - 100;
                x.freq = k[i];
                myList.add(x);
            }
        }
        System.out.println(Arrays.toString(k));
        return kq;
    }

    public static class MyNumber {
        public int value;
        public int freq;
    }


}
