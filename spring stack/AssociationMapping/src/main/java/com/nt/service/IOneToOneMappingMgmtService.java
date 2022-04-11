package com.nt.service;

import java.util.List;

import com.nt.model.Person;

public interface IOneToOneMappingMgmtService {
	
	
	public String saveDatausingParent(Person person) ; 
	
	public void loadDataUsingParent() ; 
	public String deletePArentANdCHild(int pid) ; 
	
	
	public String deleteAllPhoneNoOfParent(int pid) ; 
	
	public List<Object[]> fetchDataByJoins() ; 

}
