import java.util.Arrays;

public class String_Cau2_baikiemtraJavacore {

    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";
        // 1.Đếm số từ trong chuỗi - 13 words
        //2.Đếm và in ra index của các ký tự o

        String [] strArr = str.split("[ !?',;.]+");
        System.out.println(Arrays.toString(strArr));
        System.out.println("Số từ chủa chuỗi là: "+ strArr.length);

        int count =0;
        for (char ch : str.toCharArray()) {
            if (ch == 'o'){
                count++;
            }
        }
        System.out.println("Số kí tự 'o' là: " + count);
    }
}
