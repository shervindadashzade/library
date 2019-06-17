package library.models;

import library.Core.Library;

public class Person {
    private String nationalID;
    private String password;
    private String name, lastName, birthday;
    private Gender gender;

    public Library library;


    public Person(String nationalID, String password, String name, String lastName, String birthday, Gender gender) {
        this.nationalID = nationalID;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Person() {

    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
