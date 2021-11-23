package com.practiceproblemwithmysql.utility;

import com.practiceproblemwithmysql.controller.AddressBookController;
import com.practiceproblemwithmysql.model.Person;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int choice;
            do {
                System.out.println("Select an operation \n 1- Insert the new Contact \n 2- Update Contact \n 3- Delete Contact \n 4- Search Contact \n 5- Show All Contact \n 6- Sort \n 7- Exit ");
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
                        System.out.println(" 1- Update first name \n 2- Update last name  \n 3- Update city  \n 4- Exit ");
                        int updateChoice;
                        updateChoice = scanner.nextInt();
                        switch (updateChoice) {
                            case 1:
                                System.out.println("Enter the phone number update the first name ");
                                String firstPhone_number = scanner.next();
                                System.out.println("Enter the new first name :");
                                String UpFirst_name = scanner.next();
                                addressBookController.updateContact(firstPhone_number, UpFirst_name);
                                break;
                            case 2:
                                System.out.println("Enter the phone number update the last name ");
                                String lastPhone_number = scanner.next();
                                System.out.println("Enter the new last name :");
                                String Up_last_name = scanner.next();
                                addressBookController.updateContactLast(lastPhone_number, Up_last_name);
                                break;
                            case 3:
                                System.out.println("Enter the phone number update the city ");
                                String cityPhone_number = scanner.next();
                                System.out.println("Enter the new city name :");
                                String up_city = scanner.next();
                                addressBookController.updateContactCity(cityPhone_number, up_city);
                                break;
                            case 4:
                                break;
                        }

                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Enter the phone number contact will be deleted:");
                        String deleteContact = scanner.next();
                        addressBookController.deleteContact(deleteContact);
                        System.out.println("");

                        break;
                    case 4:
                        System.out.println("Search Contact");
                        do {
                            System.out.println(" 1- Search as first name  \n 2- Search phone number \n 3- Exit ");
                            int searchChoice = 0;
                            searchChoice = scanner.nextInt();
                            switch (searchChoice){
                                case 1:
                                    System.out.println("Enter the first name ");
                                    String searchFirst = scanner.next();
                                    for (Person each : addressBookController.searchContactFirst(searchFirst)) {
                                        System.out.println("Name: " + each.getFirst_name() + " " + each.getLast_name());
                                        System.out.println("City: " + each.getCity());
                                        System.out.println("Phone Number :" + each.getPhone_number());
                                        System.out.println();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the phone number: ");
                                    String searchPhoneNumber = scanner.next();
                                    for (Person each : addressBookController.searchContact(searchPhoneNumber)) {
                                        System.out.println("Name: " + each.getFirst_name() + " " + each.getLast_name());
                                        System.out.println("City: " + each.getCity());
                                        System.out.println("Phone Number :" + each.getPhone_number());
                                        System.out.println();
                                    }
                                    break;
                                case 3:
                                    break;
                            }break;
                        }while (choice != 3);
                        System.out.println("");

                        break;
                    case 5:
                        System.out.println("All Contact: ");
                        for (Person each : addressBookController.getAllContact()) {
                            System.out.println("Name: " + each.getFirst_name() + " " + each.getLast_name());
                            System.out.println("City: " + each.getCity());
                            System.out.println("Phone Number :" + each.getPhone_number());
                            System.out.println();
                        }
                        break;

                    case 6:
                        System.out.println("Sort");
                        System.out.println(" 1- Sort as first name   \n 2- Sort as last name \n 3- Sort as city \n 4- Exit ");
                        int sorting = 0;
                        sorting = scanner.nextInt();
                        switch (sorting){
                            case 1:
                                for (Person each : addressBookController.sortFirst_name()){
                                    System.out.println("Name: " + each.getFirst_name() + " " + each.getLast_name());
                                    System.out.println("City: " + each.getCity());
                                    System.out.println("Phone Number :" + each.getPhone_number());
                                    System.out.println();
                                }
                                System.out.println("Sort in First name ");
                                System.out.println();
                                break;
                            case 2:
                                for (Person each : addressBookController.sortLast_name()){
                                    System.out.println("Name: " + each.getFirst_name() + " " + each.getLast_name());
                                    System.out.println("City: " + each.getCity());
                                    System.out.println("Phone Number :" + each.getPhone_number());
                                    System.out.println();
                                }
                                System.out.println("Sort in last name ");
                                System.out.println();
                                break;
                            case 3:
                                for (Person each : addressBookController.sortCity()){
                                    System.out.println("Name: " + each.getFirst_name() + " " + each.getLast_name());
                                    System.out.println("City: " + each.getCity());
                                    System.out.println("Phone Number :" + each.getPhone_number());
                                    System.out.println();
                                }
                                System.out.println("Sort in city ");
                                System.out.println();
                                break;
                            case 4:
                                break;
                        }
                        break;
                    case 7:
                        break;
                }
            }
            while (choice != 7);
            System.out.println("Thanks for Using our Address Book Contact: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
