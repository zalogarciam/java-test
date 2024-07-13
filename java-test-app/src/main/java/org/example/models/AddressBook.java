package org.example.models;


import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public Contact getContact(String name) {
        return contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public int getContactCount() {
        return contacts.size();
    }
}