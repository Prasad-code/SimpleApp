package com.simple.cont;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.exc.ResourceNotFoundException;
import com.simple.mod.Customer;
import com.simple.mod.CustomerDTO;
import com.simple.mod.Request;
import com.simple.repo.RequestRepo;
import com.simple.ser.CustoSer;
import com.simple.ser.RequestService;

@RestController
@RequestMapping("/api")
public class CustoCont {
	
	@Autowired
	private RequestService reqSer;
	
	
	
	@Autowired
	private CustoSer ser;
	
	
	@GetMapping("/just")
	public String find()
	{
		return "hi";
	}
	
	@PostMapping("/add")
	public Customer create(@RequestBody CustomerDTO cust)
	{
		
		
		return ser.createCustomer(cust);
	}
	
	
	@GetMapping("/findname/{name}")
	public Customer findName(@PathVariable("name")String name)
	{
		return ser.findTheName(name);
	}
	
	@GetMapping("/all")
	public List<Customer> all()
	{
		return ser.alldata();
	}
	
	
	@GetMapping("/getData/{id}")
	public ResponseEntity<Customer> getDataById(@PathVariable("id") Integer id)
	{
		return ser.findid(id);
	}
	
	
	@GetMapping("/getrq/{id}")
	public ResponseEntity<Request> getData(@PathVariable("id") Integer id) throws ResourceNotFoundException
	{
		return reqSer.getDataReq(id);
	}
	
	
	
	
	

}
