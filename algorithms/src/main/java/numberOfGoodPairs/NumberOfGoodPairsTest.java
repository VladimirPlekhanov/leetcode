package numberOfGoodPairs;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfGoodPairsTest {

    private final int[] array = new int[]{1, 2, 3, 1, 1, 3};
    NumberOfGoodPairs n = new NumberOfGoodPairs();

    @Test
    public void numberOfGoodPairsTest() {
        int actualResult = n.numIdenticalPairs(array);
        Assert.assertEquals(4, actualResult);
    }

}
