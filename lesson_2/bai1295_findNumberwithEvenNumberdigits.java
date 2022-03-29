public class bai1295_findNumberwithEvenNumberdigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        //duyệt từng phần tử của mảng
        for (int a : nums) {
            // kiểm tra số chữ số của i
            // nếu số chữ số mà chắn thì tăng count lên 1
            int soLuongChuSo = tinhSoChuSo(a);
            if (soLuongChuSo % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //tinh so chu so cua 1 so
    private static int tinhSoChuSo(int a) {
        int count = 0;
        int result = a;

        while (result != 0) {
            result = a / 10;
            a = result;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 22, 333, 4444};
        int[] nums2 = {1, 22, 3, 4};

        System.out.println(findNumbers(nums));
        System.out.println(findNumbers((nums2)));
    }
}
