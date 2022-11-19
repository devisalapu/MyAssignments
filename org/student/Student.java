package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name");
	}
	
	public void studentDept() {
		System.out.println("Student department");
	}
	
	public void studentId() {
		System.out.println("Student id");
	}

	public static void main(String[] args) {
		 
		 Student st = new Student();
		 
		 st.collegeName();
		 st.collegeCode();
		 st.collegeRank();
		 st.deptName();
		 st.studentName();
		 st.studentDept();
		 st.studentId();
		 

	}

}
