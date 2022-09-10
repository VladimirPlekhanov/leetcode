package other.countNumbersWithEqualCountOfEvenAndOddDigits;

public class CountNumbersWithEqualCountOfEvenAndOddDigits {

    public int countNumbersWithEqualCountOfEvenAndOddDigits(int[] array) {
        int count = 0;
        int digit;
        for (int k : array) {
            int even = 0;
            int odd = 0;
            int number = String.valueOf(Math.abs(k)).length();

            for (int j = number - 1; j >= 0; j--) {
                digit = (int) (k / (Math.pow(10, j)) % 10);
                if (digit % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (even == odd) {
                count++;
            }
        }
        return count;
    }

    public int otherSolution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int even = 0;
            int odd = 0;
            String number = String.valueOf(Math.abs(array[i]));
            for (int j = 0; j < number.length(); j++) {
                int x = number.charAt(j) - '0';
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (even == odd) {
                count++;
            }
        }
        return count;
    }

}
