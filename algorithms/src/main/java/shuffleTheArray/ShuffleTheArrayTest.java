package shuffleTheArray;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleTheArrayTest {

    private final int[] nums = new int[]{2, 5, 1, 3, 4, 7};
    ShuffleTheArray s = new ShuffleTheArray();

    @Test
    public void shuffleTheArrayTest() {
        int n = 3;
        int[] actualResult = s.shuffle(nums, n);
        int[] expectedResult = new int[]{2, 3, 5, 4, 1, 7};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
