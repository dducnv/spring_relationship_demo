package com.example.demorelationship.repository;

import com.example.demorelationship.entity.Account;
import com.example.demorelationship.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
}
