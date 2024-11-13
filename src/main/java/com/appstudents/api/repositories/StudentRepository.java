package com.appstudents.api.repositories;

import com.appstudents.api.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends
        JpaRepository<Student, Long> {
}
