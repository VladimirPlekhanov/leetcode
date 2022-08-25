package other.sumElementsOnEvenPositions;

import org.junit.Assert;
import org.junit.Test;

public class SumElementsOnEvenPositionsTest {

    SumElementsOnEvenPositions s = new SumElementsOnEvenPositions();

    @Test
    public void sumElementsOnEvenPositionsTest() {
        int[] array = {1, -2, 2, 3, 1, -5, -10};
        int actualResult = s.sumElementsOnEvenPositions(array);
        Assert.assertEquals(-6, actualResult);
    }

}
