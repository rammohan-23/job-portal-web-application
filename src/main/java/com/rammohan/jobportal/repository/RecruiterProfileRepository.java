package com.rammohan.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rammohan.jobportal.entity.RecruiterProfile;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}
