package com.redley;

public class ProgramExecutor {

	public static void main(String args[]) {
		String[] students = { "1,John,Smith,John1989@gmail.com,20,88,79,59",
				"2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
				"3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87", "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
				"5,Diedrie,Redley,redley@gmail.com,40,99,98,99" };

		for (int i = 0; i < students.length; i++) {
			String[] details = students[i].split(",");
			String studentID = details[0];
			String firstname = details[1];
			String lastname = details[2];
			String emailaddress = details[3];
			int age = Integer.parseInt(details[4]);
			int grade1 = Integer.parseInt(details[5]);
			int grade2 = Integer.parseInt(details[6]);
			int grade3 = Integer.parseInt(details[7]);
			Roster.add(studentID, firstname, lastname, emailaddress, age, grade1, grade2, grade3);
		}
		Roster.print_all();
		Roster.print_invalid_emails();
		// loop through the ArrayList and for each element:
		for (int i = 0; i < Roster.studentRoster.size(); i++) {
			Roster.print_average_grade(Roster.studentRoster.get(i).getStudentId());
		}
		Roster.remove("3");
		Roster.remove("3"); // could not find 
	}
}
