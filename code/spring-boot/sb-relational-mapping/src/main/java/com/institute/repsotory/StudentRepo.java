package com.institute.repsotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
