package com.simple.mod;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;


@Entity
@Table(name="Custo")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;
	private String city;
	private Long salary;
	private int age;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private List<Request> req;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer cid, String cname, String city, Long salary, int age, List<Request> req) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
		this.salary = salary;
		this.age = age;
		this.req = req;
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
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + ", salary=" + salary + ", age=" + age
				+ ", req=" + req + "]";
	}
	
	
	
	

}
