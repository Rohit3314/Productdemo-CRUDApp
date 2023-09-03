package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product
{
    @Id
	private int pid;
	private String pname;
	private int pamount;
	
	public Product() 
	{
		super();	
	}

	public Product(int pid, String pname, int pamount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPamount() {
		return pamount;
	}

	public void setPamount(int pamount) {
		this.pamount = pamount;
	}
	
	
}
