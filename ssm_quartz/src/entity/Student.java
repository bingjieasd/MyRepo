package entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	private Integer studentno;
	private String password;
	private String studentname;
	private Integer sex;
	private Grade grade;
	private String borndate;
	private String phone;
	private String address;
	private String identityCard;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getBorndate() {
		return borndate;
	}
	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Integer getStudentno() {
		return studentno;
	}
	public void setStudentno(Integer studentno) {
		this.studentno = studentno;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [studentno=" + studentno + ", password=" + password + ", studentname=" + studentname + ", sex="
				+ sex + ", grade=" + grade + ", borndate=" + borndate + "]";
	}
	public Student(Integer studentno, String password, String studentname, Integer sex) {
		super();
		this.studentno = studentno;
		this.password = password;
		this.studentname = studentname;
		this.sex = sex;
	}
	public Student() {
		super();
	}
	
}
