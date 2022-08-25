package other.generateFibonacciNumbers;

import org.junit.Assert;
import org.junit.Test;

public class GenerateFibonacciNumbersTest {

    GenerateFibonacciNumbers g = new GenerateFibonacciNumbers();

    @Test
    public void generateFibonacciNumbersByStreamTest() {
        int[] actualResult = g.generateFibonacciNumbersByStream(14);
        int[] expectedResult = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        Assert.assertArrayEquals(expectedResult, actualResult);

        int[] actualResult1 = g.generateFibonacciNumbersByStream(1);
        int[] expectedResult1 = {0};
        Assert.assertArrayEquals(expectedResult1, actualResult1);

        int[] actualResult2 = g.generateFibonacciNumbersByStream(2);
        int[] expectedResult2 = {0, 1};
        Assert.assertArrayEquals(expectedResult2, actualResult2);
    }

    @Test
    public void generateFibonacciNumbersTest() {
        int[] actualResult = g.generateFibonacciNumbers(14);
        int[] expectedResult = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        Assert.assertArrayEquals(expectedResult, actualResult);

        int[] actualResult1 = g.generateFibonacciNumbers(1);
        int[] expectedResult1 = {0};
        Assert.assertArrayEquals(expectedResult1, actualResult1);

        int[] actualResult2 = g.generateFibonacciNumbers(2);
        int[] expectedResult2 = {0, 1};
        Assert.assertArrayEquals(expectedResult2, actualResult2);
    }

}
