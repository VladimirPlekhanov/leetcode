package convertTheTemperature;

public class ConvertTheTemperature {

    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }

}
