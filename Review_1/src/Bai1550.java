public class Bai1550 {

    // cach 1:
    public boolean threeConsecutiveOdds(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    //c2:
    public boolean threeConsecutiveOdds2(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] % 2 + a[i + 1] % 2 + a[i + 2] % 2 == 3) {
                return true;
            }
        }
        return false;
    }
}
