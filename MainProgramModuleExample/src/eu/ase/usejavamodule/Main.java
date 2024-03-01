package eu.ase.usejavamodule;

import eu.ase.javamodule.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Sam", new float[] {7.8f, 9.9f});
		
		System.out.println(student.toString());
	}

}
