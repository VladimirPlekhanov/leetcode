package defangingAnIpAddress;

import org.junit.Assert;
import org.junit.Test;

public class DefangingAnIpAddressTest {

    private final String ip = "255.100.50.0";
    DefangingAnIpAddress d = new DefangingAnIpAddress();

    @Test
    public void defangingAnIpAddressTest(){
        String actualResult = d.defangIPaddr(ip);
        String expectedResult = "255[.]100[.]50[.]0";
        Assert.assertEquals(expectedResult, actualResult);
    }

}
