package com.simple.mod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requ")
public class Request {
	
	@Id
	@GeneratedValue
	private Integer rid;
	private String type;
	private String rname;
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(Integer rid, String type, String rname) {
		super();
		this.rid = rid;
		this.type = type;
		this.rname = rname;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "Request [rid=" + rid + ", type=" + type + ", rname=" + rname + "]";
	}
	
	
	
	
	

}
