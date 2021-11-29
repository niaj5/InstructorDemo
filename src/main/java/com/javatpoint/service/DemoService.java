package com.javatpoint.service;

import com.javatpoint.exception.EntityNotFound;
import com.javatpoint.model.Instructor;
import com.javatpoint.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//defining the business logic
@Service
public class DemoService {
    private final List<Instructor> listIn = new ArrayList<>();

    @Autowired
    DemoRepository demoRepository;

    //getting all books record by using the method findaAll() of CrudRepository
    public List<Instructor> getAllInstructor() {
        List<Instructor> instructor = new ArrayList<Instructor>();

        demoRepository.findAll().forEach(instructor1 -> instructor.add(instructor1));
        return instructor;
    }
    //getting a specific record by using the method findById() of CrudRepository

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Instructor instructor) {
        demoRepository.save(instructor);
    }

    public List<Instructor> getDetailsByName(String instructorName) {
         /*   demoRepository.findByInstructorName(instructorName);
            Instructor instructorDTO = new Instructor();
        instructorDTO.setInstructorName(instructorDTO.getInstructorName());
        instructorDTO.setName(instructorDTO.getName());
        listIn.add(instructorDTO);
        System.out.println(listIn);*/
        //Code to be finalized
        return listIn; }


}


