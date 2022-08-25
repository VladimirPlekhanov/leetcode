package other.generatePrimeNumbers;

import org.junit.Assert;
import org.junit.Test;

public class GeneratePrimeNumbersTest {

    GeneratePrimeNumbers g = new GeneratePrimeNumbers();

    @Test
    public void generatePrimeNumbersTest() {
        int[] actualResult = g.generatePrimeNumbers(10);
        int[] expectedResult = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
