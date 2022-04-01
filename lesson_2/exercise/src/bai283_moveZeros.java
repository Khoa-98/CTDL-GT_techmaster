package exercise.src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bai283_moveZeros {

    public static void moveZeroes(int[] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                a[t] = a[i];
                t++;
            }
        }
        for (; t < a.length; t++) {
            a[t] = 0;
        }
    }

    public static void main(String[] args) {
        bai283_moveZeros bai283 = new bai283_moveZeros();
        int []a = {0,1,0,3,12};
        bai283.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
