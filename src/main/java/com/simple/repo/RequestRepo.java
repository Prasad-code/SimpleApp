package com.simple.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simple.mod.Request;

@Repository
public interface RequestRepo extends JpaRepository<Request, Integer> {

}
