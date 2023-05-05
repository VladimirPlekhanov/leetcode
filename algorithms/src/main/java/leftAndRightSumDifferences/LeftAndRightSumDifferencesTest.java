package leftAndRightSumDifferences;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LeftAndRightSumDifferencesTest {

    LeftAndRightSumDifferences l = new LeftAndRightSumDifferences();
    int[] array1 = new int[]{10,4,8,3};
    int[] array2 = new int[]{8, 28, 35, 21, 13, 21, 72, 35, 52, 74};


    @Test
    public void leftAndRightSumDifferencesTest() {
        int[] expectedResult1 = new int[]{15,1,11,22};
        int[] expectedResult2 = new int[]{351, 315, 252, 196, 162, 128, 35, 72, 159, 285};
        int[] actualResult1 = l.leftRigthDifference(array1);
        int[] actualResult2 = l.leftRigthDifference(array2);
        assertArrayEquals(expectedResult1, actualResult1);
        assertArrayEquals(expectedResult2, actualResult2);
    }

}
