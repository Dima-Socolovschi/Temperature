package Temperature;

public class TemperatureConverter {
    public double convertTemperature(double temperature, String transferFrom, String transferTo) {

        double newTemperature = 0;

        switch (transferFrom.toLowerCase()) {
            case ("c"):
                switch (transferTo.toLowerCase()) {
                    case ("c") -> newTemperature = temperature;
                    case ("k") -> newTemperature = temperature + 273.15;
                    case ("f") -> newTemperature = (temperature * 1.8) + 32;
                }
                break;
            case ("k"):
                switch (transferTo.toLowerCase()) {
                    case ("c") -> newTemperature = temperature - 273.15;
                    case ("k") -> newTemperature = temperature;
                    case ("f") -> newTemperature = (temperature - 273.15) * 1.8 + 32;
                }
                break;
            case ("f"):
                switch (transferTo.toLowerCase()) {
                    case ("c") -> newTemperature = (temperature - 32) * 5/9;
                    case ("k") -> newTemperature = (temperature - 32) * 5/9 + 273.15;
                    case ("f") -> newTemperature = temperature;
                }
                break;
            default:
                System.out.println("Unknown data provided.");
        }
        return newTemperature;
    }
}
