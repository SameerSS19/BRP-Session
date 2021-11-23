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

    public void updateContact(String phone_number,String first_name){
        Person person = new Person();
        person.setPhone_number(phone_number);
        person.setFirst_name(first_name);
        addressBookService.updateContactToDB(person);
    }

    public void updateContactLast(String phone_number,String last_name){
        Person person = new Person();
        person.setPhone_number(phone_number);
        person.setLast_name(last_name);
        addressBookService.updateContactLast_nameToDB(person);
    }

    public void updateContactCity(String phone_number,String city){
        Person person = new Person();
        person.setPhone_number(phone_number);
        person.setCity(city);
        addressBookService.updateContactCityToDB(person);
    }


    public void deleteContact(String phone_number){
        Person person = new Person();
        person.setPhone_number(phone_number);
        addressBookService.deleteContactToDB(person);
    }

    public List< Person> searchContact(String phone_number)
    {

       return addressBookService.searchContactToDB(phone_number);

    }

    public  List<Person> searchContactFirst(String first_name){
       return addressBookService.searchContactFirst_nameToDB(first_name);
    }


    public List<Person> sortFirst_name(){
        return addressBookService.sortByFirstNameToDB();
    }

    public List<Person> sortLast_name(){
        return addressBookService.sortByLastNameToDB();
    }

    public List<Person> sortCity(){
        return addressBookService.sortByCityToDB();
    }

    public List<Person> getAllContact()

    {
      return addressBookService.getAllContactFromDB();
    }
}
