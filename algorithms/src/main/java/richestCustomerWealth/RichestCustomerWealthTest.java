package richestCustomerWealth;

import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {

    private final int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
    RichestCustomerWealth r = new RichestCustomerWealth();

    @Test
    public void richestCustomerWealthTest() {
        int expectedResult = r.maximumWealth(accounts);
        Assert.assertEquals(expectedResult, 10);
    }

}
