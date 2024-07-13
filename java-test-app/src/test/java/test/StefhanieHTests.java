package test;

import org.example.models.IGVCalculator;
import static org.junit.jupiter.api.Assertions.*;

import org.example.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class IGVCalculatorTests {
    private IGVCalculator igvCalculator;

    @BeforeEach
    public void setUp() {
        igvCalculator = new IGVCalculator();
    }

    @Test
    public void testIGVCalculator() {
        // Arrange
        var expectedIGVResult = 35.4;
        var product = new Product();
        product.Name = "Cookie";
        product.Price = 10;
        var quantity = 3;

        // Act
        var actualIGVResult = igvCalculator.CaculateIGV(product, quantity);

        // Assert
        assertEquals(expectedIGVResult, actualIGVResult);
    }
}