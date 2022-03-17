package concatenationOfArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ConcatenationOfArrayTest {

  private final int[] nums = new int[]{1, 2, 1};
  ConcatenationOfArray c = new ConcatenationOfArray();

  @Test
  public void concatenationOfArrayTest() {
    int[] actualArr = c.getConcatenation(nums);
    int[] expectedArr = new int[]{1, 2, 1, 1, 2, 1};
    assertArrayEquals(expectedArr, actualArr);
  }

}
