package kidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultArray = new ArrayList<>();
        int maxNum = 0;

        for (int n : candies) {
            if (n > maxNum) {
                maxNum = n;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxNum) {
                resultArray.add(true);
            } else resultArray.add(false);
        }

        return resultArray;
    }

}
