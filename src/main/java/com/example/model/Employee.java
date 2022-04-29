package com.example.model;

public class Employee {
	private int empid;
	private String empfname;
	private String emplname;
	private int age;
	private String emailid;
	private String phoneNo;
	private String city;
	public Employee() {
	 
	}
	
	public Employee(String empfname, String emplname, int age, String emailid, String phoneNo, String city) {
		this.empfname = empfname;
		this.emplname = emplname;
		this.age = age;
		this.emailid = emailid;
		this.phoneNo = phoneNo;
		this.city = city;
	}
	
	public Employee(int empid, String empfname, String emplname, int age, String emailid, String phoneNo, String city) {
		this.empid = empid;
		this.empfname = empfname;
		this.emplname = emplname;
		this.age = age;
		this.emailid = emailid;
		this.phoneNo = phoneNo;
		this.city = city;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpfname() {
		return empfname;
	}
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empfname=" + empfname + ", emplname=" + emplname + ", age=" + age
				+ ", emailid=" + emailid + ", phoneNo=" + phoneNo + ", city=" + city + "]";
	}
	
	
	
	
	

}
