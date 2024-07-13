package org.example.models;

public class TemperatureConverterNahomy {

    public TemperatureConverterNahomy() {

    }

    public double CelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
