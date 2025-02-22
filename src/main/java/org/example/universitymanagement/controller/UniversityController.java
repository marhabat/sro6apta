package org.example.universitymanagement.controller;

import org.example.universitymanagement.model.University;
import org.example.universitymanagement.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universities")
public class UniversityController {

    @Autowired
    private UniversityRepository universityRepository;

    @GetMapping
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    @PostMapping
    public University createUniversity(
            @RequestParam String name,
            @RequestParam String location
    ) {
        University university = new University();
        university.setName(name);
        university.setLocation(location);
        return universityRepository.save(university);
    }

}
