package com.nt.runner;

import java.util.List;
import java.util.Set;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Person;
import com.nt.model.PhoneNumber;
import com.nt.service.IOneToOneMappingMgmtService;

@Component
public class OneToOneMappingRunner implements CommandLineRunner {

	@Autowired
	private IOneToOneMappingMgmtService is ; 
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		PhoneNumber ph1 =  new PhoneNumber() ; 
		// setting the first phone number 
		ph1.setPhoneNumber(387982379L);
		ph1.setNoType("office");
		ph1.setProvider("airtel");
		
		
		// setting the second phonenumber 
		
		PhoneNumber ph2 =  new PhoneNumber() ; 
		
		ph2.setPhoneNumber(873984792L);
		ph2.setNoType("home");
		ph2.setProvider("reliance");
		
		//setting the person details
		
		Person person =  new Person() ; 
		
		person.setPname("salman");
		person.setPaddress("mumbai");
		person.setPn(Set.of(ph1,ph2));
		
		/*	try
			{
				is.saveDatausingParent(person) ; 
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}*/
		
		/*	
			try
			{
				is.loadDataUsingParent();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}*/
		
		
		/*
				try
				{
					is.deletePArentANdCHild(1000) ; 
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				*/
		
		
		/*try
		{
			is.deleteAllPhoneNoOfParent(2000) ;  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		try {
			
		
		 is.fetchDataByJoins().forEach(row->{
			 
			 for(Object v:row)
			 {
				 System.out.print(v + " ") ; 
			 }
			 System.out.println() ;
			 
		 }); 
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
		
		
		
	}

}
	