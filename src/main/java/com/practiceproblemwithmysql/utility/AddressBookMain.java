package com.practiceproblemwithmysql.utility;

import com.practiceproblemwithmysql.controller.AddressBookController;
import com.practiceproblemwithmysql.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            int choice = 0;
            do {
                System.out.println("Select an operation \n 1- Insert the new Contact \n 2- Update Contact \n 3- Delete Contact \n 4- Search Contact \n 5- Show All Contact ");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                AddressBookController addressBookController = new AddressBookController();
                UserInput userInput = UserInput.getInstance();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your name: ");
                        String first_name = userInput.stringInputUser();
                        System.out.println("Enter the last name: ");
                        String last_name = userInput.stringInputUser();
                        System.out.println("Enter the city: ");
                        String city = userInput.stringInputUser();
                        System.out.println("Enter the Mobile number : ");
                        String phone_number = userInput.stringInputUser();
                        addressBookController.addContact(first_name, last_name, city, phone_number);
                        break;
                    case 2:
                        System.out.println("");
                        addressBookController.updateContact(person.getFirst_name(),person.getPhone_number());
                        break;
                    case 3:
                        System.out.println("Delete Contact");
                        addressBookController.deleteContact(person.getPhone_number());
                        break;
                    case 4:
                        System.out.println("Search Contact ");
                        for (Person each: addressBookController.searchContact(phone_number)) {
                            System.out.println("Name: " + each.getFirst_name()+ " "+ each.getLast_name());
                            System.out.println("City: " + each.getCity());
                            System.out.println("Phone Number :" + each.getPhone_number());
                            System.out.println( );
                        }
                        break;
                    case 5:
                        System.out.println("All Contact: ");
                        for (Person each : addressBookController.getAllContact()) {
                            System.out.println("Name: " + each.getFirst_name()+ " "+ each.getLast_name());
                            System.out.println("City: " + each.getCity());
                            System.out.println("Phone Number :" + each.getPhone_number());
                            System.out.println( );
                        }
                        break;
                }
            }
            while (choice != 5);
            System.out.println("Thanks for Using our Address Book Contact: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
