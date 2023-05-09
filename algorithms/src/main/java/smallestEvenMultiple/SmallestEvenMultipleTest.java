package smallestEvenMultiple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestEvenMultipleTest {

    SmallestEvenMultiple s = new SmallestEvenMultiple();

    @Test
    public void smallestEvenMultipleTest() {
        int expected = 10;
        int actual = s.smallestEvenMultiple(5);
        assertEquals(expected, actual);
    }

}
