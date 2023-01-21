package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        System.out.println(addressBook.contact.getFirstName());
        System.out.println(addressBook.contact.getLastName());
        System.out.println(addressBook.contact.getAddress());
        System.out.println(addressBook.contact.getCity());
        System.out.println(addressBook.contact.getState());
        System.out.println(addressBook.contact.getPhoneNumber());
        System.out.println(addressBook.contact.getEmail());
        addressBook.editContact();
        System.out.println(addressBook.contact.getFirstName());
        System.out.println(addressBook.contact.getLastName());
        System.out.println(addressBook.contact.getAddress());
        System.out.println(addressBook.contact.getCity());
        System.out.println(addressBook.contact.getState());
        System.out.println(addressBook.contact.getPhoneNumber());
        System.out.println(addressBook.contact.getEmail());
    }
}
