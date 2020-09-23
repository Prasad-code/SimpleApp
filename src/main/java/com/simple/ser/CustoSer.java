package com.simple.ser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.simple.exc.ResourceNotFoundException;
import com.simple.mod.Customer;
import com.simple.mod.CustomerDTO;
import com.simple.mod.Request;
import com.simple.repo.CustoRepo;

@Service
public class CustoSer {
	
	@Autowired
	private CustoRepo rep;

	public Customer createCustomer(CustomerDTO cust) {
		
		Customer c=new Customer();
		c.setCid(cust.getCid());
		c.setCname(cust.getCname());
		c.setCity(cust.getCity());
		c.setSalary(cust.getSalary());
		c.setAge(cust.getAge());
		c.setReq(populatesRequest(cust));
		return rep.save(c);
	}

	private List<Request> populatesRequest(CustomerDTO cust) {
		
		List<Request> list=new ArrayList<>();
		cust.getReq().forEach(a->{
			Request r=new Request();
			r.setRid(a.getRid());
			r.setType(a.getType());
			r.setRname(a.getRname());
			list.add(r);
				
		});
		
				
		
		return list;
	}

	public ResponseEntity<Customer> findid(Integer id) {
	
		Customer c=rep.findById(id).orElseThrow(()->new ResourceNotFoundException(""+id));
		return ResponseEntity.ok().body(c);
	}

	public List<Customer> alldata() {
		// TODO Auto-generated method stub
		return rep.findAll()
				.stream()
				.distinct()
				.sorted(Comparator.comparingLong(Customer::getSalary).reversed())
				.limit(1)
				//.map(Customer::getCname)
				.collect(Collectors.toList());
		
				
				
				
								
				
		
	}

	public Customer findTheName(String name) {
			
		
		return rep.findByName(name);
	}
	
	
	

}
