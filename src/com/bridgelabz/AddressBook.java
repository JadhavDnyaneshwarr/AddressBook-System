package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    public static ArrayList<Contact> contactList = new ArrayList<>();

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
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        contactList.add(contact);
        System.out.println("Contact Details are added");
    }
    public void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name you want to edit = ");
        String searchName = scanner.next();
        for (Contact contact:contactList) {
            if (contact.getFirstName().equalsIgnoreCase(searchName)) {
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
                break;
            }
        }
    }
    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name you want to delete = ");
        String searchName = scanner.next();
        for (Contact contact:contactList) {
            if (contact.getFirstName().equalsIgnoreCase(searchName)) {
                contact.setFirstName(null);
                contact.setLastName(null);
                contact.setAddress(null);
                contact.setCity(null);
                contact.setState(null);
                contact.setPhoneNumber(null);
                contact.setEmail(null);
                break;
            }
        }
    }

    public static void displayContact() {
        for (Contact contactsDetails : contactList ) {
            System.out.println(contactsDetails);
            System.out.println("---------------------------");
        }
    }

    static HashMap<String, ArrayList<Contact>> addressBookHashMap = new HashMap<>();
    public void dictionary(String nameOfAddressBook){
        addressBookHashMap.put(nameOfAddressBook, contactList );
        System.out.println(addressBookHashMap);
    }
}
