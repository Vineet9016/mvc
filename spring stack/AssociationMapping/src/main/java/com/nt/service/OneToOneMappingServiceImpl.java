package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Person;
import com.nt.model.PhoneNumber;
import com.nt.repo.PersonRepo;
import com.nt.repo.PhoneNumberRepo;

@Service("otmservice")
public class OneToOneMappingServiceImpl implements IOneToOneMappingMgmtService{

	
	@Autowired
	private PersonRepo personRepo ; 
	
	@Autowired
	private PhoneNumberRepo phoneNumberRepo  ;


	
	@Override
	public String saveDatausingParent(Person person) {
		
		return personRepo.save(person).getPid() + "peron is saved "; 
		
		
		
	
		
		
		
	
		
		
	}

	@Override
	public void loadDataUsingParent() {
		// TODO Auto-generated method stub
		List<Person> list = personRepo.findAll() ;
		
		list.forEach(per->{
			
			Set<PhoneNumber> childs = per.getPn() ; 
			childs.forEach(ph->{
				System.out.println("childs are "+ ph) ; 
			}) ; 
			
		});
		
		
		
		
	}

	@Override
	public String deletePArentANdCHild(int pid) {
		// TODO Auto-generated method stub
			Optional<Person> op  = personRepo.findById(pid) ;
			
			if(op.isPresent())
			{
				personRepo.delete(op.get());
				return "person  and his phone  numbers are deleted " ; 
			}
			else 
				return "person not found" ; 
		
		
	}

	@Override
	public String deleteAllPhoneNoOfParent(int pid) {
		Optional<Person> op  = personRepo.findById(pid) ;
		
		if(op.isPresent())
		{
				Set<PhoneNumber> childs = op.get().getPn() ;
				
				phoneNumberRepo.deleteAll(childs);

				
				return "all phone numbers of the person have been deleted" ; 
		}
		else 
			return "person not found" ; 
	
		
	}

	@Override
	public List<Object[]> fetchDataByJoins() {
		// TODO Auto-generated method stub
			return  personRepo.getDataByJoins() ;
		//return dataByJoins ; 
	}
	
	
	

}
