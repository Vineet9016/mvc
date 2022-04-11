package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="AM_PHONENUMBER_DETAILS")
@Getter
@Setter
public class PhoneNumber implements Serializable {

	
	@Id
	@GeneratedValue
	private int regNo ; 
	
	
	@Column(length=20)
	private String noType; 
	
	private Long phoneNumber ;
	
	@Column(length=20)
	private String provider ;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", noType=" + noType + ", phoneNumber=" + phoneNumber + ", provider="
				+ provider + "]";
	} 
	
		



}
