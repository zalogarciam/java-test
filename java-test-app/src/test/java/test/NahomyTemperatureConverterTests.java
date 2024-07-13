package test;

import org.example.models.TemperatureConverterNahomy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NahomyTemperatureConverterTests {
    private TemperatureConverterNahomy temperatureConverter;

    @BeforeEach
    public void setUp() {
        temperatureConverter = new TemperatureConverterNahomy();
    }

    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        var celsius = 25.0;
        var expectedFahrenheit = 77.0;

        // Act
        var actualFahrenheit = temperatureConverter.CelsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        var fahrenheit = 77.0;
        var expectedCelsius = 25.0;

        // Act
        var actualCelsius = temperatureConverter.FahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expectedCelsius, actualCelsius);
    }
}
