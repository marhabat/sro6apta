package org.example.universitymanagement.repository;

import org.example.universitymanagement.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
