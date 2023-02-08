package com.example.library.service;

import com.example.library.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Lib_service {
    private static List<Library> libraries = new ArrayList<>();
    static {
        Library l1 = new Library("Aksha","Jaipur",3423424,
                List.of("Separate Reading Hall with seating capacity of 250","Digital library and Internet Facility",
                        "Open Access for all students"),
                List.of("Java","C++","Python","Php"));
        libraries.add(l1);
    }

    public List<Library> getlibraries() {
        return libraries;
    }

    public void addlibrary(Library library) {
        libraries.add(library);
    }

    public Library getbyname(String name) {
        Predicate<? super Library> predicate = obj -> obj.getName().equals(name);
        Library l1 = libraries.stream().filter(predicate).findFirst().get();
        return l1;
    }

    public void update(Library library,String name) {
        Library l = getbyname(name);
        l.setName(library.getName());
        l.setAddress(library.getAddress());
        l.setNumber(library.getNumber());
        l.setBooks(library.getBooks());
        l.setFacilities(library.getFacilities());

    }

    public void deletel(String name) {
        Predicate<? super Library> predicate = obj -> obj.getName().equals(name);
        libraries.removeIf(predicate);
    }
}
