package jewelsAndStones;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    JewelsAndStones j = new JewelsAndStones();

    @Test
    public void jewelsAndStonesTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int actualResult = j.numJewelsInStones(jewels, stones);
        Assert.assertEquals(3, actualResult);
    }

}
