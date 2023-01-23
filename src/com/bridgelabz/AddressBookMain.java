package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void menuChoose(AddressBook addressDetails){
        Scanner sc = new Scanner(System.in);
        int chooseNumber;
        do {
            System.out.println("Enter the no as u want too choose to perform the certain task");
            System.out.println("1. Add Deatils \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber){
                case 1:
                    System.out.println("Add Details");
                    addressDetails.addContact();
                    break;
                case 2:
                    System.out.println("Edit details");
                    addressDetails.editContact();
                    break;
                case 3:
                    System.out.println("Delete Details");
                    addressDetails.deleteContact();
                    break;
                case 4:
                    System.out.println("Display contacts");
                    addressDetails.displayContact();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option choose");
                    break;
            }
//           System.out.println("Do you want to contiune if yes press 1");
//           option=sc.nextInt();
        }while (chooseNumber !=5 );


    }
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        AddressBook addressDetails = new AddressBook();
        menuChoose(addressDetails);
    }
}
