package com.vcube.complaint.service;

import java.util.List;


import com.vcube.complaint.model.Complaint;
public interface ComplaintService {
	
	    Complaint add(Complaint complaint);
	    
	    Complaint getById(Integer id);

	    List<Complaint> getAll();

	    Complaint update(Integer id, Complaint complaint);

	    String delete(Integer id);

}
