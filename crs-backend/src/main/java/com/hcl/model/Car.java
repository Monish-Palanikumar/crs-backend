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

	@Column(name = "availability")
	private String availability;

	public Car() {
	}

	public Car(int cid, String cname, String availability) {
		super();
		this.cid = cid;
		this.cname = cname;
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

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", availability=" + availability + "]";
	}

}
