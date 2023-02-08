package com.example.library.model;

import java.util.List;

public class Library {
    private String name;
    private String address;
    private int number;
    private List<String> facilities;
    private List<String> books;

    public Library(String name, String address, int number, List<String> facilities, List<String> books) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", facilities=" + facilities +
                ", books=" + books +
                '}';
    }
}
