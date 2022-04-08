import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bai2164 {
    public int[] sortEvenOdd(int[] a) {
        List<Integer> listSoChan = new ArrayList<>();
        List<Integer> listSoLe = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                listSoChan.add(a[i]);
            } else {
                listSoLe.add(a[i]);
            }
        }

        listSoChan.sort(Comparator.naturalOrder());
        listSoLe.sort(Comparator.reverseOrder());

        int isChan = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = listSoChan.get(isChan);
            } else {
                a[i] = listSoLe.get(isChan);
                isChan++;
            }
        }
        return a;
    }
}
