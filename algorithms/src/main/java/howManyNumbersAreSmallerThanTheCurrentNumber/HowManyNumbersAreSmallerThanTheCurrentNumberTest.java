package howManyNumbersAreSmallerThanTheCurrentNumber;

import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    private final int[] array = new int[]{8, 1, 2, 2, 3};
    HowManyNumbersAreSmallerThanTheCurrentNumber h = new HowManyNumbersAreSmallerThanTheCurrentNumber();

    @Test
    public void howManyNumbersAreSmallerThanTheCurrentNumberTest() {
        int[] actualResult = h.smallerNumbersThanCurrent(array);
        int[] expectedResult = new int[]{4, 0, 1, 1, 3};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
