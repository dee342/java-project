package com.redley;

public class Student {

	String studentId;
	String fname;
	String lname;
	String email;
	int age;
	int[] grades;

	 Student(String aStudentId, String firstname, String lastname, String emailid, int aAge, int[] aGrades) {
		this.studentId = aStudentId;
		this.fname = firstname;
		this.lname = lastname;
		this.email = emailid;
		this.age = aAge;
		this.grades = aGrades;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	public void print() {
		System.out.print("Student ID: " + this.getStudentId() +"\t");
		System.out.print("Firstname: " + this.getFname()  +"\t");
		System.out.print("Lastname: " + this.getLname()  +"\t");
		System.out.print("Age: " + this.getAge()  +"\t");
		System.out.print("Email: " + this.getEmail()  +"\t");
		System.out.print("Grades: {" + this.getGrades()[0] + "," + this.getGrades()[1] + "," + this.getGrades()[2] +" }" + "\t");
	}
}
