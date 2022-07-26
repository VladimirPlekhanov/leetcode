package runningSumOf1dArray;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumOf1dArrayTest {

    private final int[] nums = new int[]{1, 2, 3, 4};
    RunningSumOf1dArray r = new RunningSumOf1dArray();

    @Test
    public void runningSumOf1dArrayTest() {
        int[] actualArr = r.runningSum(nums);
        int[] expectedArr = new int[]{1, 3, 6, 10};
        assertArrayEquals(expectedArr, actualArr);
    }

}
