import java.util.ArrayList;
import java.util.List;

public class Bai1816_Truncate_Sentence {


    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String kq = "";

        for (int i = 0; i < k; i++) {
            kq += arr[i] + " ";
        }
        return kq.trim();
    }
}
