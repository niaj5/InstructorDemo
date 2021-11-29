package com.javatpoint.controller;

import com.javatpoint.model.Instructor;
import com.javatpoint.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//mark class as Controller
@RestController
public class DemoController {
    //autowire the BooksService class
    @Autowired
    DemoService demoservice;

    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/instructor")
    private List<Instructor> getAllInstructors() {
        return demoservice.getAllInstructor();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/instructors/{instructorName}")
    private List<Instructor> getInstructor(@PathVariable("instructorName") String instructorName) {
        return demoservice.getDetailsByName(instructorName);
    }

      //creating post mapping that post the book detail in the database
    @PostMapping("/instructor")
    private int saveBook(@RequestBody Instructor instructor) {
        demoservice.saveOrUpdate(instructor);
        return instructor.getId();
    }
}
