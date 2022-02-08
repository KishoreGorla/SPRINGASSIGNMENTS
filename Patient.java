package com.cg.parent.model;

public class Patient{
	
	private String pid;
	private String pname;
	private String disease;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdmit_status() {
		return admit_status;
	}
	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String sex;
	private String admit_status;
	private int age;

}
