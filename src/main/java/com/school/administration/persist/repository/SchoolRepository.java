package com.school.administration.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.administration.persist.domain.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
