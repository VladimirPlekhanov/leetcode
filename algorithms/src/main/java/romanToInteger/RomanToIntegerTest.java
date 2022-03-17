package romanToInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

  RomanToInteger r = new RomanToInteger();

  @Test
  public void romanToIntegerTest() {
    String s = "MCMXCIV";
    int actualNum = r.romanToInt(s);
    int expectedNum = 1994;
    assertEquals(expectedNum, actualNum);
  }

}
