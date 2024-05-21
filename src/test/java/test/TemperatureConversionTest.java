package test;

import Temperature.TemperatureConverter;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Random;

@Epic("Temperature Converter")
@Owner("Orange System")

public class TemperatureConversionTest {

    public double temp;
    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @BeforeSuite(description = "Value Generator")
    public void getRandomData(){
        Random rnd = new Random();
        this.temp = rnd.nextDouble() * 100;

    }

    @Test(description = "Celsius to Kelvin Test")
    public void testCelsiusToKelvin(){

        String from = "c";
        String to = "k";

        double checkTemp = temp + 273.15;

        double newTemp = temperatureConverter.convertTemperature(temp, from, to);

        Assert.assertEquals(newTemp, checkTemp);
    }

    @Test(description = "Kelvin to Celsius")
    @Description("This is a test description")
    public void testKelvinToCelsius(){


        Allure.step("Generage test data.");

        String from = "k";
        String to = "c";

        double checkTemp = temp - 273.15;

        Allure.attachment("From value:", from);
        Allure.attachment("From to:", to);
        Allure.attachment("Start Temp:", String.valueOf(checkTemp));

        Allure.step("Convert temperature.");

        double newTemp = temperatureConverter.convertTemperature(temp, from, to);

        Assert.assertEquals(newTemp, checkTemp);
    }
}
