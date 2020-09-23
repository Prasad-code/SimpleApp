package com.simple.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.simple.mod.Customer;
import com.simple.mod.CustomerDTO;


@Repository
public interface CustoRepo extends JpaRepository<Customer, Integer> {

	@Query("select c from Customer c where c.cname=:name")
	Customer findByName(@Param("name") String name);

	//Customer saveAll(CustomerDTO cust);

}
