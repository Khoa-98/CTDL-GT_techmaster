public class Bai485_MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] a) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count = 0;
            } else {  // a[i] == 1
                count++;
                max = max < count ? count : max; // toán tử 3 ngôi: nếu count > max thì gán max bằng count , không thì vẫn gán  = max
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(a);
        System.out.println("Done");

//        int a = 0;
//        int t = (++a) +(a++) +(++a);
//        System.out.println("t = " + t);
    }
}
