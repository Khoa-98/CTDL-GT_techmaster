import java.util.HashMap;
import java.util.Map;

public class Bai1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<Domino, Integer> map = new HashMap<>();

        for (int[] domino : dominoes) {
            Domino domino1 = new Domino(domino);
            int lastvalue = map.getOrDefault(domino1, 0);

            count += lastvalue;
            map.put(domino1, lastvalue + 1);
        }

        return count;
    }

    public static class Domino {
        public int x;
        public int y;

        public Domino(int[] arr) {
            x = arr[0];
            y = arr[1];
        }


        @Override
        public int hashCode() {
            if (x > y) {
                return x * 10 + y;
            }
            return y * 10 + x;
        }

        @Override
        public boolean equals(Object obj) {
            return this.hashCode() == obj.hashCode();
        }

    }
}
