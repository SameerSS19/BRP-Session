package com.practiceproblemwithmysql.model;

public class Person {
    private String first_name;
    private String last_name;
    private String city;
    private String phone_number;

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_name(){
        return  last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
}
