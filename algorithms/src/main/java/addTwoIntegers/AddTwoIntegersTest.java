package addTwoIntegers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoIntegersTest {

    int num1 = -10;
    int num2 = 4;
    AddTwoIntegers a = new AddTwoIntegers();

    @Test
    public void addTwoIntegers() {
        int expectedResult = -6;
        int actualResult = a.sum(num1, num2);
        assertEquals(actualResult, expectedResult);
    }

}
