package other.countNumbersWithEqualCountOfEvenAndOddDigits;

import org.junit.Assert;
import org.junit.Test;

public class CountNumbersWithEqualCountOfEvenAndOddDigitsTest {

    CountNumbersWithEqualCountOfEvenAndOddDigits c = new CountNumbersWithEqualCountOfEvenAndOddDigits();

    @Test
    public void countNumbersWithEqualCountOfEvenAndOddDigitsTest() {
        int[] array = {11, 12, -22, -25, 145, 1588, 0, 10};
        int actualResult = c.countNumbersWithEqualCountOfEvenAndOddDigits(array);
        Assert.assertEquals(4, actualResult);
    }
}
