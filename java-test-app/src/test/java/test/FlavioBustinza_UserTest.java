/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.models.FlavioBustinza_User;
        

/**
 *
 * @author Acer
 */
public class FlavioBustinza_UserTest {

    private FlavioBustinza_User user;

    @BeforeEach
    public void setUp() {
        user = new FlavioBustinza_User();
    }

    @Test
    public void testUser() {
        // Arrange
        String passwordExpected = "*****";
        // Act
        FlavioBustinza_User user = new FlavioBustinza_User();
        user.setUser("Flaven");
        user.setPassword("12345");
        String result = user.encryptPassword(user.getPassword());

        // Assert
        assertEquals(passwordExpected, result);
    }
}
