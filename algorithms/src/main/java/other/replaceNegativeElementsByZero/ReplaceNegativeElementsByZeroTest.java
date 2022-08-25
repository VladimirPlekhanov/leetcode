package other.replaceNegativeElementsByZero;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceNegativeElementsByZeroTest {

    ReplaceNegativeElementsByZero r = new ReplaceNegativeElementsByZero();

    @Test
    public void replaceNegativeElementsByZeroTest() {
        int[] array = {1, -2, 0, 3, 1, -5, -10};
        int[] actualResult = r.replaceNegativeElementsByZero(array);
        int[] expectedResult = {1, 0, 0, 3, 1, 0, 0};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
