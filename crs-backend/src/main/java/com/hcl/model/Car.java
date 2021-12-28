package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;

	@Column(name = "cname")
	private String cname;

	@Column(name = "ctype")
	private String ctype;

	@Column(name = "availability")
	private String availability;

	public Car() {
	}

	public Car(int cid, String cname, String ctype, String availability) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
		this.availability = availability;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", ctype=" + ctype + ", availability=" + availability + "]";
	}

}
