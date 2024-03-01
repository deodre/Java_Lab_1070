package eu.ase.lab2;

import java.util.Arrays;

public class Student implements Cloneable {
	
	private int studentId;
	private String name;
	private float[] grades;
	
	public Student() {
		this.studentId = 0;
		this.name = new String();
		this.grades = null;
	}
	
	public Student(int studentId, String name, float[] grades) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.grades = grades;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float[] getGrades() {
		
		float[] gradesCopy = new float[this.grades.length];
		System.arraycopy(this.grades, 0, gradesCopy, 0, this.grades.length);
		//return gradesCopy;
		
		return grades;
	}

	public void setGrades(float[] grades) {
		
		this.grades = Arrays.copyOf(grades, grades.length);
	}
	
	public float avgGrade() {
		float avgGrade = 0;
		for (float grade : this.grades) {
			avgGrade += grade;
		}
		
		avgGrade /= this.grades.length;
		
		return avgGrade;
	}

	@Override
	public String toString() {
		String studentStr = new String();
		studentStr = "Student " + this.getStudentId()
			+ "\n\tName: " + this.getName()
			+ "\n\tGrades: " + Arrays.toString(this.getGrades());
		
		return studentStr;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Student student = new Student();
		
		student.setStudentId(this.getStudentId());
		student.setName(this.getName());
		student.setGrades(this.getGrades());
		
		return student;
	}
	
	
	
	
}
