package String_Array;

public class Bai941 {
    public static boolean validMountainArray(int[] arr) {
        int indexMax = 0;
        if (arr.length < 3) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) return false;

            if (arr[i] > arr[i + 1]) {
                indexMax = i;
                break;
            }
        }
        if (indexMax == 0 || indexMax == arr.length - 1) return false;
        for (int i = indexMax; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        System.out.println(validMountainArray(arr));
    }
}
