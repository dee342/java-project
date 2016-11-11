package com.redley;

import java.util.ArrayList;

public class Roster {
	public static ArrayList<Student> studentRoster = new ArrayList<Student>();
	private static final String email_regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	
	public  static void add(String studentID, String firstname, String lastname, String emailaddress, int age,
			int grade1, int grade2, int grade3) {
		int grades[] = new int[3];
		grades[0] = grade1;
		grades[1] = grade2;
		grades[2] = grade3;
		Student student = new Student(studentID, firstname, lastname, emailaddress, age, grades);
		studentRoster.add(student);
	}

	public void test() {
		System.out.println("testing");
	}

	public static void remove(String studentID) {
		int index = 0;
		for (int i = 0; i < studentRoster.size(); i++) {
			String id = studentRoster.get(i).getStudentId();
			if (id.equals(studentID)) { //  
				index = i;
				break;
			}
		}
		if (index > 0) {
			studentRoster.remove(index);
		} else {
			System.out.println("Could not able to find the Student with given ID");
		}
	}

	public static void print_all() {
		for (int i = 0; i < studentRoster.size(); i++) {
			studentRoster.get(i).print();
			System.out.println();
		}
		
	}

	public static void print_average_grade(String studentID) {
		for (int i = 0; i < studentRoster.size(); i++) {
			String id = studentRoster.get(i).getStudentId();
			if (id.equals(studentID)) {
				int[] grades = studentRoster.get(i).getGrades();
				int avg = (grades[0] + grades[1] + grades[2]) / 3;
				System.out.println("Student with Id " + id + " got an Avg of " + avg + "%");
			}
		}
	}

	public static void print_invalid_emails() {
		System.out.println("------Invalid Emails------");
		for (int i = 0; i < studentRoster.size(); i++) {
			String studentEmail = studentRoster.get(i).getEmail();
			Boolean b = studentEmail.matches(email_regex);

			if (!b) {
				System.out.println(studentRoster.get(i).getEmail());
			}
		}
	}
}
