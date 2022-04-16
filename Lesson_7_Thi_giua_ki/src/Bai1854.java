public class Bai1854 {
    public int maximumPopulation(int[][] logs) {
        int [] countPops = new int [2051];
        for (int[] arr : logs) {
            int a = arr[0];
            int b = arr[1];
            for (int i = a; i < b; i++) {
                countPops[i]++;
            }
        }
        int maxCount =countPops[1950];
        int year = 1950;
        for (int i = 1950; i < countPops.length; i++) {
            if(countPops[i] > maxCount){
                maxCount = countPops[i];
                year = i;
            }
        }
        return year;
    }
}
