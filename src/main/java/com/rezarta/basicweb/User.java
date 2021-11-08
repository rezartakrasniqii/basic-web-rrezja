package com.rezarta.basicweb;

public class User {
    private String name;
    private String surname;
    private int age;

    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Age: " + age;
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}