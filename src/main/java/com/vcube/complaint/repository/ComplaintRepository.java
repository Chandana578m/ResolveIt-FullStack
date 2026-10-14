package com.vcube.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.complaint.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

}
