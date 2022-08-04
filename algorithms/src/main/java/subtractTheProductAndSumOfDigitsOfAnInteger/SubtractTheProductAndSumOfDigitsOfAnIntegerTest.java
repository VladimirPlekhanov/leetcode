package subtractTheProductAndSumOfDigitsOfAnInteger;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    SubtractTheProductAndSumOfDigitsOfAnInteger s = new SubtractTheProductAndSumOfDigitsOfAnInteger();

    @Test
    public void subtractTheProductAndSumOfDigitsOfAnIntegerTest(){
        int n = 234;
        int actualResult = s.subtractProductAndSum(n);
        Assert.assertEquals(15, actualResult);
    }

}
