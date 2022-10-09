package com.example.demorelationship.repository;

import com.example.demorelationship.entity.Account;
import com.example.demorelationship.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
