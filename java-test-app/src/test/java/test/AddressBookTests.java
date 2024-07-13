package test;

import org.example.models.AddressBook;
import org.example.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTests {
    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testAddContact() {
        // Arrange
        var contact = new Contact("John Doe", "1234567890", "john.doe@example.com");

        // Act
        addressBook.addContact(contact);

        // Assert
        assertEquals(1, addressBook.getContactCount());
        assertNotNull(addressBook.getContact("John Doe"));
    }

    @Test
    public void testRemoveContact() {
        // Arrange
        var contact = new Contact("John Doe", "1234567890", "john.doe@example.com");
        addressBook.addContact(contact);

        // Act
        addressBook.removeContact("John Doe");

        // Assert
        assertEquals(0, addressBook.getContactCount());
        assertNull(addressBook.getContact("John Doe"));
    }

    @Test
    public void testGetContact() {
        // Arrange
        var contact = new Contact("John Doe", "1234567890", "john.doe@example.com");
        addressBook.addContact(contact);

        // Act
        var retrievedContact = addressBook.getContact("John Doe");

        // Assert
        assertNotNull(retrievedContact);
        assertEquals(contact.getName(), retrievedContact.getName());
        assertEquals(contact.getPhoneNumber(), retrievedContact.getPhoneNumber());
        assertEquals(contact.getEmail(), retrievedContact.getEmail());
    }

    @Test
    public void testGetContactCount() {
        // Arrange
        var contact1 = new Contact("John Doe", "1234567890", "john.doe@example.com");
        var contact2 = new Contact("Jane Doe", "0987654321", "jane.doe@example.com");
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        // Act
        int contactCount = addressBook.getContactCount();

        // Assert
        assertEquals(2, contactCount);
    }
}