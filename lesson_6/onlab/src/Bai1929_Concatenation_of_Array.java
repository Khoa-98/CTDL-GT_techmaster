public class Bai1929_Concatenation_of_Array {
    public int[] getConcatenation(int[] a) {
        int[] arr = new int[2 * a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
            arr[i + a.length] = a[i];
        }
        return arr;
    }

}
