package other.countNumbersWithOnlyUniqueDigits;

public class CountNumbersWithOnlyUniqueDigits {

    public int countNumbersWithOnlyUniqueDigits(int[] array) {
        int counter = 0;
        for (int number : array) {
            String s = String.valueOf(Math.abs(number));
            boolean isDistinct = true;
            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        isDistinct = false;
                        break;
                    }
                }
            }
            if (isDistinct) counter++;
        }
        return counter;
    }

}
