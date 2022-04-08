public class Bai2114 {
    public static int demSotu(String s) {
        String[] arr = s.split(" ");
        return arr.length;
    }

    public int mostWordsFound(String[] sentences) {

        int kq = 0;
        for (String str : sentences) {
            int soLuongTu = demSotu(str);
            if (soLuongTu > kq) {
                kq = soLuongTu;
            }
        }
        return kq;
    }


}
