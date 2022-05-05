import java.util.Scanner;

public class VeTamGiac {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" # ");
            }
            System.out.println(" # ");
        }
        System.out.println("========");

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" # ");
            }
            System.out.println(" # ");
        }

        System.out.println("=====");

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j < n + i - 1; j++) {
                System.out.print("#");
            }
            System.out.println("#");
        }
        System.out.println("==========");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 2 * n - 1 - i; j > i; j--) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
