package jdbcmain; 
import java.util.*;
import java.util.Scanner;

import Model.Student;
import crud.studentcrud;

public class app {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("student information");
		Student s1=new Student();
		
		
		studentcrud c1=new studentcrud();
		System.out.println("enter the id of student");
		s1.setId(sc.nextInt());
		System.out.println("enter the name of student");
		s1.setName(sc.next());
		
		System.out.println("enter the marks of student");
		s1.setMarks(sc.nextInt());
		
		
		
		
		
		
		
	}

}
