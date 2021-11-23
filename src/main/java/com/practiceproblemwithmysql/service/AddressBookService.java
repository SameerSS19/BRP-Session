package com.practiceproblemwithmysql.service;


import com.practiceproblemwithmysql.model.Person;
import com.practiceproblemwithmysql.repo.AddressBookRepo;

import java.util.List;

public class AddressBookService {
    private AddressBookRepo addressBookRepo = new AddressBookRepo();

    public void addContactToDB(Person person) {
        addressBookRepo.save(person);
    }

    public void updateContactToDB(Person person) {
        addressBookRepo.updateContact(person);
    }

    public void updateContactLast_nameToDB(Person person){
        addressBookRepo.updateLast_name(person);
    }

    public void updateContactCityToDB(Person person){
        addressBookRepo.updateCity(person);
    }

    public void deleteContactToDB(Person person){
        addressBookRepo.deleteRecord(person);
    }

    public List<Person> searchContactToDB(String phone_number){
     return addressBookRepo.searchContactAsPhoneNumber(phone_number);
    }

    public List<Person> searchContactFirst_nameToDB(String first_name){
      return   addressBookRepo.searchContactAsFirst_name(first_name);
    }

    public List<Person> sortByFirstNameToDB(){
        return addressBookRepo.sortContactAsFirst_name();
    }

    public List<Person> sortByLastNameToDB(){
        return addressBookRepo.sortContactAsLast_name();
    }

    public List<Person> sortByCityToDB(){
        return addressBookRepo.sortContactAsCity();
    }

    public List<Person> getAllContactFromDB()
    {
       return addressBookRepo.getAllContactDB();
    }
}
