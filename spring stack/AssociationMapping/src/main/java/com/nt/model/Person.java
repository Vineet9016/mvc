package com.nt.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="AM_PEROSN_DETAILS")
@Getter
@Setter
public class Person implements Serializable{

	@Id
	@SequenceGenerator(name="gen1", initialValue = 1000,allocationSize = 1,  sequenceName = "PID_SEQ")
	@GeneratedValue(generator ="gen1", strategy=GenerationType.SEQUENCE)
	private int pid ; 
	
	@Column(length=20)
	private String pname ;
	
	@Column(length=20)
	private String paddress;
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="perosn_id", referencedColumnName = "pid")
	private Set<PhoneNumber> pn ;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	} 
	
	
	
	
	
}
