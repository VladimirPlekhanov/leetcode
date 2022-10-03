package other.findDuplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;

public class FindDuplicatesTest {

    FindDuplicates f = new FindDuplicates();

    @Test
    public void findDuplicatesTest() {
        int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 2, -1, 2, 3, 43, 5, 5, 5, 1, 1, 1, 2, -1, -1};
        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(1, 7);
        expectedResult.put(2, 7);
        expectedResult.put(3, 4);
        expectedResult.put(-1, 3);
        expectedResult.put(5, 3);
        Map<Integer, Integer> actualResult = Stream.of(f.findDuplicates(array))
            .collect(Collectors.toMap(r -> r[0], r -> r[1]));
        Assert.assertEquals(expectedResult, actualResult);
    }

}
