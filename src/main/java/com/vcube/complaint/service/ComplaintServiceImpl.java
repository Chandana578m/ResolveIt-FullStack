package com.vcube.complaint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.complaint.model.Complaint;
import com.vcube.complaint.repository.ComplaintRepository;
@Service
public class ComplaintServiceImpl implements ComplaintService{
	@Autowired
	ComplaintRepository complaintRepository;

	@Override
	public Complaint add(Complaint complaint) {
		return complaintRepository.save(complaint);
	}

	@Override
	public Complaint getById(Integer id) {
		return complaintRepository.findById(id).get();
	}

	@Override
	public List<Complaint> getAll() {
		return complaintRepository.findAll();
	}


@Override
public Complaint update(Integer id, Complaint complaint) {

    Complaint existing = complaintRepository.findById(id)
            .orElseThrow(() ->
                new RuntimeException("Complaint not found"));

    if (complaint.getName() != null) {
        existing.setName(complaint.getName());
    }

    if (complaint.getCategory() != null) {
        existing.setCategory(complaint.getCategory());
    }

    if (complaint.getDescription() != null) {
        existing.setDescription(complaint.getDescription());
    }

    if (complaint.getPriority() != null) {
        existing.setPriority(complaint.getPriority());
    }

    if (complaint.getStatus() != null) {
        existing.setStatus(complaint.getStatus());
    }

    return complaintRepository.save(existing);
}


	@Override
	public String delete(Integer id) {
		complaintRepository.deleteById(id);
		return "Complaint Deleted Successfully";
	}

}
