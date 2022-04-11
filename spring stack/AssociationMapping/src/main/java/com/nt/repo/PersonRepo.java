package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.model.Person;

public interface PersonRepo extends  JpaRepository<Person, Integer> {
	
	
	@Query("SELECT p.pid, p.pname, p.paddress, ph.regNo, ph.phoneNumber, ph.provider from Person p left join p.pn ph")
	public List<Object[]> getDataByJoins() ; 
	
	

}
