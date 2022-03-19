package palindromeNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeNumberTest {

  PalindromeNumber p = new PalindromeNumber();

  @Test
  public void palindromeNumberTest() {
    int n = 121;
    boolean actualResult = p.isPalindrome(n);
    assertTrue(actualResult);
  }

}
