package com.vcube.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.complaint.model.Complaint;
import com.vcube.complaint.service.ComplaintService;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "http://localhost:3000")
public class ComplaintController {
@Autowired
   ComplaintService service;


    @PostMapping
    public Complaint add(@RequestBody Complaint complaint) {
        return service.add(complaint);
    }

    @GetMapping
    public List<Complaint> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/{id}")
    public Complaint getComplaintById(@PathVariable Integer id) {
    	return service.getById(id);
    	
    }

    @PutMapping("/{id}")
    public Complaint update(
            @PathVariable Integer id,
            @RequestBody Complaint complaint) {
        return service.update(id, complaint);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "Complaint deleted successfully";
    }
}
