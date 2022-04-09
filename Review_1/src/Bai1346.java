import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai1346 {

    // cach 1
    public boolean checkIfExist(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == 2 * a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //cach 2:

    public boolean checkIfExist2(int[] a) {


        return false;
    }
}
