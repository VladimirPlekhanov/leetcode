package minimumSumOfFourDigitNumberAfterSplittingDigits;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {

    MinimumSumOfFourDigitNumberAfterSplittingDigits m = new MinimumSumOfFourDigitNumberAfterSplittingDigits();

    @Test
    public void minimumSumOfFourDigitNumberAfterSplittingDigitsTest(){
        int num = 2932;
        int actualResult = m.minimumSum(num);
        Assert.assertEquals(52, actualResult);
    }

}
