package com.institute.repsotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
}
