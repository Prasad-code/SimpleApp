package com.simple.ser;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.simple.exc.ResourceNotFoundException;
import com.simple.mod.Customer;
import com.simple.mod.Request;
import com.simple.repo.RequestRepo;

@Service
public class RequestService {
	
	
	@Autowired
	private RequestRepo repo;

	public ResponseEntity<Request> getDataReq(Integer id) throws ResourceNotFoundException {
		
		Request r= repo.findById(id).orElseThrow(()->new ResourceNotFoundException(""+id));
		
	return ResponseEntity.ok().body(r);
	}

	

}
