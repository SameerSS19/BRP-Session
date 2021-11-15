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

    public void deleteContactToDB(Person person){
        addressBookRepo.deleteRecord(person);
    }

    public Person searchContactToDB(){
      return   addressBookRepo.searchContact();
    }

    public List<Person> getAllContactFromDB()
    {
       return addressBookRepo.getAllContactDB();
    }
}
