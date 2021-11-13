package com.practiceproblemwithmysql.controller;

import com.practiceproblemwithmysql.model.Person;
import com.practiceproblemwithmysql.service.AddressBookService;

import java.util.List;


public class AddressBookController {
    private AddressBookService addressBookService = new AddressBookService();

    public  void addContact(String first_name,String last_name,String city, String phone_number){
        Person person = new Person();
        person.setFirst_name(first_name);
        person.setLast_name(last_name);
        person.setCity(city);
        person.setPhone_number(phone_number);
        addressBookService.addContactToDB(person);
    }

    public void updateContact(String first_name,String last_name,String phone_number){
        Person person = new Person();
        person.setFirst_name(first_name);
        person.setLast_name(last_name);
        person.setPhone_number(phone_number);
        addressBookService.updateContactToDB(person);
    }

    public void deleteContact(String first_name){
        Person person = new Person();
        person.setFirst_name(first_name);
        addressBookService.deleteContactToDB(person);
    }

    public List<Person> getAllContact() {
      return addressBookService.getAllContactFromDB();
    }
}
