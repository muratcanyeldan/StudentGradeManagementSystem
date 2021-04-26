package com.muratcan.studentgrademanagementsystem.repository;

import com.muratcan.studentgrademanagementsystem.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
