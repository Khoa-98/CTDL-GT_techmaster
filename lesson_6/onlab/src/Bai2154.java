import java.util.Arrays;

public class Bai2154 {

    public int findFinalValue(int[] a, int o) {
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a);
            if(a[i] == o){
                o = o*2;
            }
        }
        return o;
    }
}
