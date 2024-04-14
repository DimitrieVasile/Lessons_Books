package homework_nr_4;

public class TemperatureConverter {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsiusTemperature = 50;
        double convertedToFahrenheit = converter.toFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " degrees Celsius is equal to " + convertedToFahrenheit + " degrees Fahrenheit");

        double fahrenheitTemperature = 122;
        double convertedToCelsius = converter.toCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " degrees Fahrenheit is equal to " + convertedToCelsius + " degrees Celsius");
    }

    public double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
