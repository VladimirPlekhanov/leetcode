package other.countNumbersWithOnlyUniqueDigits;

import org.junit.Assert;
import org.junit.Test;

public class CountNumbersWithOnlyUniqueDigitsTest {

    CountNumbersWithOnlyUniqueDigits c = new CountNumbersWithOnlyUniqueDigits();

    @Test
    public void countNumbersWithOnlyUniqueDigitsTest() {
        int[] array = {11, 12, -22, -252, 145, 1588, 484, -1907, 0};
        int actualResult = c.countNumbersWithOnlyUniqueDigits(array);
        Assert.assertEquals(4, actualResult);
    }

}
