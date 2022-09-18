package other.rotateArray;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

    RotateArray r = new RotateArray();

    @Test
    public void rotateArrayTest() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] actualResult = r.rotateArray(array);
        int[][] expectedResult = {
                {4, 1},
                {5, 2},
                {6, 3}
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
