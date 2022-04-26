import java.util.HashSet;

public class Bai202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(true){
            int sum =0;
            while (n > 0){
                sum += (n%10)*(n%10);
                n/= 10;
            }
            if(sum == 1){
                return true;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
        }
    }
}
