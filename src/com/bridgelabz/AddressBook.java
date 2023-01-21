package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Contact contact = new Contact();

    void addContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name = ");
        String firstName = scanner.next();
        System.out.println("Enter Last name = ");
        String lastName = scanner.next();
        System.out.println("Enter Address = ");
        String address = scanner.next();
        System.out.println("Enter City = ");
        String city = scanner.next();
        System.out.println("Enter State = ");
        String state = scanner.next();
        System.out.println("Enter Phone Number = ");
        String phoneNumber = scanner.next();
        System.out.println("Enter Email = ");
        String email= scanner.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
    }
}
