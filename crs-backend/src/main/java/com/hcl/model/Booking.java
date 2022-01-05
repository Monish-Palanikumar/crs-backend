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

	@Column(name = "uname")
	private String uname;

	@Column(name = "cname")
	private String cname;

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

	@Column(name = "comments")
	private String comments;

	public Booking() {
		super();
	}

	public Booking(int bid, String uname, String cname, String ctype, Date start, Date end, Integer quantity,
			String status, String comments) {
		super();
		this.bid = bid;
		this.uname = uname;
		this.cname = cname;
		this.ctype = ctype;
		this.start = start;
		this.end = end;
		this.quantity = quantity;
		this.status = status;
		this.comments = comments;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", uname=" + uname + ", cname=" + cname + ", ctype=" + ctype + ", start=" + start
				+ ", end=" + end + ", quantity=" + quantity + ", status=" + status + ", comments=" + comments + "]";
	}

}
