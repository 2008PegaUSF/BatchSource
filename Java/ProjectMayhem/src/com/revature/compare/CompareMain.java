package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student [] {
						new Student (15,"Matt",8.43),
						new Student (23,"Abid",3.67),
						new Student (10,"Mark", 0.68),
						new Student (12,"Dom",9.99),
						new Student (27,"Raul",4.0),
						new Student (6,"Felix", 3.86)
				}));
		System.out.println("Original List");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("==================");
		Collections.sort(studentList);
		System.out.println("Sorted by StudentID:");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("==================");
		Collections.sort(studentList, new StudentComparator());
		System.out.println("Sorted by Student GPA:");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("==================");
		System.out.println("Sort by Label w/Lambda");
		Collections.sort(studentList, (arg0,arg1)
				->{return arg0.getLabel().compareTo(arg1.getLabel());}
				);
		for(Student s: studentList) {
			System.out.println(s);
		}
	}

}
