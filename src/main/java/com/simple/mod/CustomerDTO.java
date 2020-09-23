package com.simple.mod;

import java.util.List;

public class CustomerDTO {
	
	private Integer cid;
	private String cname;
	private String city;
	private Long salary;
	private int age;
	private List<Request> req;
	public CustomerDTO(Integer cid, String cname, String city, Long salary, int age, List<Request> req) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
		this.salary = salary;
		this.age = age;
		this.req = req;
	}
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Request> getReq() {
		return req;
	}
	public void setReq(List<Request> req) {
		this.req = req;
	}
	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", cname=" + cname + ", city=" + city + ", salary=" + salary + ", age=" + age
				+ ", req=" + req + "]";
	}
	
	
	

}
