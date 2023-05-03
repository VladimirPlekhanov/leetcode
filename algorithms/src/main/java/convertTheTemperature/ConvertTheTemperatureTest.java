package convertTheTemperature;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertTheTemperatureTest {

    double celsius = 122.11;
    ConvertTheTemperature c = new ConvertTheTemperature();

    @Test
    public void convertTheTemperatureTest() {
        double[] actualArr = c.convertTemperature(celsius);
        double[] expectedArr = new double[]{395.26000, 251.79800};
        assertArrayEquals(expectedArr, actualArr, 0);
    }

}
