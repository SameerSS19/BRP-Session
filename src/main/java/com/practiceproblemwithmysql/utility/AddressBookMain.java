package com.practiceproblemwithmysql.utility;

import com.practiceproblemwithmysql.controller.AddressBookController;
import com.practiceproblemwithmysql.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        try {
            int choice = 0;
            do {
                System.out.println("Select an operation \n 1- Insert the new Contact \n 2- Update Contact \n 3- Delete Contact \n 4- Search Contact \n 5- Show All Contact ");
                Scanner choicein = new Scanner(System.in);
                choice = choicein.nextInt();
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
                        System.out.println("Enter your name: ");
                        String first_name1 = userInput.stringInputUser();
                        System.out.println("Enter the last name: ");
                        String last_name1 = userInput.stringInputUser();
                        System.out.println("Enter the Mobile number : ");
                        String phone_number1 = userInput.stringInputUser();
                        addressBookController.updateContact(first_name1, last_name1, phone_number1);
                        break;
                    case 3:
                        System.out.println("Delete Contact");
                        Person person = new Person();
                        addressBookController.deleteContact(person.getFirst_name());
                        break;
                    case 5:
                        System.out.println("All Contact: ");
                        for (Person each : addressBookController.getAllContact()) {
                            System.out.println(each.getFirst_name());
                            System.out.println(each.getPhone_number());
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
