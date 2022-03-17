package twoSum;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {

  private final int[] nums = new int[]{2, 7, 11, 15};
  TwoSum t = new TwoSum();

  @Test
  public void twoSumTest() {
    int target = 9;
    int[] actualArr = t.twoSum(nums, target);
    int[] expectedArr = new int[]{0, 1};
    assertArrayEquals(expectedArr, actualArr);
  }

}
