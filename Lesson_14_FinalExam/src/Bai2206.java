import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai2206 {
    public boolean divideArray(int[] a) {
        Arrays.sort(a);

        for (int i = 1; i < a.length; i= i+2) {
            if(a[i] != a[i-1]){
                return false;
            }
        }
        return true;
    }
}
