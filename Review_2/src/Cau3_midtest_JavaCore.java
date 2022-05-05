import java.util.Random;
import java.util.Scanner;

public class Cau3_midtest_JavaCore {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int random = rd.nextInt(100);

        System.out.println(random + "  - " + isPrimeNumber(random));

        int n = 10;
        int count = 0;
        int i = 2;
        System.out.println("10 so nguyen to dau tien la: ");
        while (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("cac so nguyen to nho hon 10 la: ");

        int k =2;
        while (k < n) {
            if (isPrimeNumber(k)) {
                System.out.print(k + " ");
            }
            k++;
        }


    }
}
