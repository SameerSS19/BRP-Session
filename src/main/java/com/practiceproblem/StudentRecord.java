package com.practiceproblem;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {

        try
        {    int choice=0;
            Student s = new Student();
            do
            {
                System.out.println("Select an operation \n 1- Registration \n 2- Password Update \n 3- Delete a Record \n 4- Search for a Student \n 5- Exit");
                Scanner choicein = new Scanner(System.in);
                choice=choicein.nextInt();
                switch(choice)
                {
                    case 1:
                        s.getStudentDetails();
                        s.insertStudent();
                        break;
                    case 2:
                        s.updateStudentPassword();
                        break;
                    case 3:
                        s.deleteStudentRecord();
                        break;
                    case 4:
                        s.searchStudent();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Select the correct choice");
                }
            }while(choice!=5);
            System.out.println("Thanks for Using our Software");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
