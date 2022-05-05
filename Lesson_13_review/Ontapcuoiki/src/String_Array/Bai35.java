package String_Array;

public class Bai35 {

    public int searchInsert(int[] a, int target) {
        int L = 0;
        int R = a.length - 1;

        while (L <= R) {
            int mid = L + (R - L) / 2; // tuong duong voi (L+R)/2
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) { // neu mid lơn hơn thi bo nưa bên phải
                R = mid - 1;
            } else if (a[mid] < target) {  // neu mid nhỏ hơn thì bỏ nửa bên trái
                L = mid + 1;
            }
        }

        return R + 1;
    }
}
