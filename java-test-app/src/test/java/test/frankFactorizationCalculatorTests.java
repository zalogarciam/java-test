package test;

import org.example.models.Product;
import org.example.models.FactorizationCalculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorizationCalculatorTests {
    private FactorizationCalculator factorizationCalculator;

    @BeforeEach
    public void setUp() {
        factorizationCalculator = new FactorizationCalculator();
    }

    @Test
    public void testFactorizationCalculator() {
        // Arrange
        var expectedFactorizationResult = 30.0;
        var product = new Product();
        product.Name = "Cookie";
        product.Price = 10;
        var quantity = 3;

        // Act
        var actualFactorizationResult = factorizationCalculator.CalculateFactorization(product, quantity);

        // Assert
        assertEquals(expectedFactorizationResult, actualFactorizationResult);
    }
}
