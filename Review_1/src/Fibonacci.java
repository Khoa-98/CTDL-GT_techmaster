public class Fibonacci {

    // C1
    // Tinh fibo cua so thu x
    public static int fibo(int x) {
        int F0 = 0;
        int F1 = 1;
        int Fn = 1;

        if (x < 0) {
            return -1;
        } else if (x == 0 || x == 1) {
            return x;
        } else {
            for (int i = 2; i < x; i++) {
                F0 = F1;
                F1 = Fn;
                Fn = F0 + F1;
            }
        }

        return Fn;
    }

    //C2: 1 cach tong quat, tao ra 1 mang
    public static int fibo2(int n) {
        int[] a = new int[100];
        a[1] = a[2] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    // C3: Sd de quy
    public static int fibo3(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }
        return fibo3(n - 1) + fibo3(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(fibo2(6));
        System.out.println(fibo3(6));
    }
}
