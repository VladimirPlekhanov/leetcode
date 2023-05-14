package strictlyPalindromicNumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class StrictlyPalindromicNumberTest {

    StrictlyPalindromicNumber s = new StrictlyPalindromicNumber();

    @Test
    public void strictlyPalindromicNumberTest() {
        boolean actual = s.isStrictlyPalindromic(9);
        assertFalse(actual);
    }

}
