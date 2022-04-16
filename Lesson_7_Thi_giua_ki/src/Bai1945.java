public class Bai1945 {
    public int getLucky(String s, int k) {
        int sum1 = 0;

        for (char ch : s.toCharArray()) {
            int number = (ch - 'a') + 1;
            if (number > 9) {
                sum1 = sum1 + (number % 10) + (number / 10);
            } else {
                sum1 = sum1 + number;
            }

        }
        k--;
        int sumDigit = sum1;
        int sum = 0;
        while (k > 0) {
            while (sum1 > 0) {
                int digit = sum1 % 10;
                sum = sum + digit;
                sum1 = sum1 / 10;
            }
            sumDigit = sum;
            sum1 = sum;
            sum = 0;
            k -=1;
        }


        return sumDigit;
    }
}
