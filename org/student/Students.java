package org.student;

public class Students {

	public void getStudentInfo(int id) {
		
		System.out.println("Student id is: " +id);
	}
	
    public void getStudentInfo(int id, String name) {
		
		System.out.println("Student id is: " +id + " and Student name is : " + name);
	}

    public void getStudentInfo(String email, String ph) {
	
    	System.out.println("Student email is: " + email + " and Student  is Phone number is: " + ph);
}
	public static void main(String[] args) {
		
		
		Students stu = new Students();
		
		stu.getStudentInfo(1234);
		stu.getStudentInfo(1234, "Test Student");
		stu.getStudentInfo("Test@gmail.com", "123456");

	}

}
