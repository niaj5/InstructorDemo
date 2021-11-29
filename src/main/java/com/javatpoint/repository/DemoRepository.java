package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.javatpoint.model.Instructor;

import java.util.Optional;

public interface DemoRepository extends CrudRepository<Instructor, Integer>
{
    Iterable<Object> findAllById(int id);
    Optional<Instructor> findByInstructorName(String instructorName);
}
