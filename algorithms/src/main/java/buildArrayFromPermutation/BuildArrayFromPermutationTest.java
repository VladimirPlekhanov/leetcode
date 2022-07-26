package buildArrayFromPermutation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BuildArrayFromPermutationTest {

    private final int[] nums = new int[]{0, 2, 1, 5, 3, 4};
    BuildArrayFromPermutation b = new BuildArrayFromPermutation();

    @Test
    public void buildArrayFromPermutationTest() {
        int[] actualArr = b.buildArray(nums);
        int[] expectedArr = new int[]{0, 1, 2, 4, 5, 3};
        assertArrayEquals(expectedArr, actualArr);
    }

}
