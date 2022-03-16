package romanToInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

  RomanToInteger r = new RomanToInteger();

  @Test
  public void romanToIntegerTest() {
    String s = "MCMXCIV";
    int actualNumb = r.romanToInt(s);
    int expectedNumb = 1994;
    assertEquals(expectedNumb, actualNumb);
  }

}
