package com.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int did;
	private String dname;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee> e=new HashSet<Employee>();
	/**
	 * @return the did
	 */
	public int getDid() {
		return did;
	}
	/**
	 * @param did the did to set
	 */
	public void setDid(int did) {
		this.did = did;
	}
	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}
	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}
	/**
	 * @return the e
	 */
	public Set<Employee> getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(Set<Employee> e) {
		this.e = e;
	}
	
	

}
