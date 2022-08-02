package kidsWithTheGreatestNumberOfCandies;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesTest {

    private final int[] candies = new int[]{2, 3, 5, 1, 3};
    KidsWithTheGreatestNumberOfCandies k = new KidsWithTheGreatestNumberOfCandies();

    @Test
    public void kidsWithTheGreatestNumberOfCandiesTest() {
        int extraCandies = 3;
        List<Boolean> actualResult = k.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>(Arrays.asList(true, true, true, false, true));
        Assert.assertEquals(expectedResult, actualResult);
    }

}
