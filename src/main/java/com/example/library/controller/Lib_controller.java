package com.example.library.controller;

import com.example.library.model.Library;
import com.example.library.service.Lib_service;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Lib_controller {
    @Autowired
    private Lib_service libService;
    @GetMapping("/libraries")
    public List<Library> gelAlllib(){
        return libService.getlibraries();
    }
    @GetMapping("/libraries/get-by")
    public Library getLibbyname(@Nullable @RequestParam String name){
        return libService.getbyname(name);
    }
    @PostMapping("/add-library")
    public void addlib(@RequestBody Library library){
         libService.addlibrary(library);
    }

    @PutMapping("/update-library/by-name/{name}")
    public void updateLib(@RequestBody Library library,@PathVariable String name){
        libService.update(library,name);
    }
    @DeleteMapping("/delete-library/by-name/{name}")
    public void deleteLib(@PathVariable String name){
        libService.deletel(name);
    }


}
