package designParkingSystem;

import org.junit.Assert;
import org.junit.Test;

public class DesignParkingSystemTest {

    DesignParkingSystem d = new DesignParkingSystem(1, 1, 0);

    @Test
    public void designParkingSystemTest() {
        boolean actualResult1 = d.addCar(1);
        boolean actualResult2 = d.addCar(2);
        boolean actualResult3 = d.addCar(3);
        boolean actualResult4 = d.addCar(1);
        Assert.assertTrue(actualResult1);
        Assert.assertTrue(actualResult2);
        Assert.assertFalse(actualResult3);
        Assert.assertFalse(actualResult4);
    }

}
