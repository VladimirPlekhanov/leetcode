package minimumSumOfFourDigitNumberAfterSplittingDigits;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public int minimumSum(int num) {
        int[] array = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
        Arrays.sort(array);
        return Integer.parseInt(array[0] + "" + array[2]) + Integer.parseInt(array[1] + "" + array[3]);
    }

}
