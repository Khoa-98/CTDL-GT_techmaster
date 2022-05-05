import java.util.Scanner;
        /*
        Nhập các phần tử mảng
        In thông tin mảng ra màn hình
        Liệt kê các phần tử nằm trên đường chéo chính
         */

public class Cau6_mang2chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so dong:");
        int soDong = sc.nextInt();
        System.out.println("Nhap so cot");
        int soCot = sc.nextInt();

        int[][] arr = new int[soDong][soCot]; // tao mang 2 chieu trong Heap
        // nhap tung phan tu cua mang 
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("phan tu thu: [" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        // in mang 2 chieu ra 
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // in het 1 dong thi xuong dong
        }
        int sum = 0;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}

