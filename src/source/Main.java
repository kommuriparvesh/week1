package source;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1=new Student("Siva");
		Student st2=new Student("Ravi");
		Student st3=new Student("John");
		Student st4=new Student("Dennis");
		Student st5=new Student("Vijay");
		
		College clg1=new College("LU");
		College clg2=new College("SRM");
		
		clg1.addStudent(st1);
		clg1.addStudent(st2);
		clg1.addStudent(st3);
		
		clg1.showStudents();
		clg1.announceUpdate("Oncampus classwork start from 03/09/2021.Kindly make note of that.");
		
		
		clg2.addStudent(st4);
		clg2.addStudent(st5);
		
		clg2.showStudents();
		clg2.announceUpdate("Oncampus classwork start from 2021/09/06.Kindly make note of that.");
		
		
	}

}
