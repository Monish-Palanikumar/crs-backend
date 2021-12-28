package com.hcl.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;

	@Column(name = "cid")
	private Integer cid;

	@Column(name = "ctype")
	private String ctype;

	@Column(name = "start")
	private Date start;

	@Column(name = "end")
	private Date end;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "status")
	private String status;

	public Booking() {
		super();
	}

	public Booking(int bid, Integer cid, String ctype, Date start, Date end, Integer quantity, String status) {
		super();
		this.bid = bid;
		this.cid = cid;
		this.ctype = ctype;
		this.start = start;
		this.end = end;
		this.quantity = quantity;
		this.status = status;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", cid=" + cid + ", ctype=" + ctype + ", start=" + start + ", end=" + end
				+ ", quantity=" + quantity + ", status=" + status + "]";
	}

}
