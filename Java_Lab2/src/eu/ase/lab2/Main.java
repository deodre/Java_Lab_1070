package eu.ase.lab2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[5];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		System.out.println("----------------------------------------");
		
		int[] arr2 = new int[] {1, 2, 3, 4};
		
		for (int element : arr2) {
			System.out.println(element);
		}
		
		System.out.println("----------------------------------------");
		
		int[] arr3 = new int[arr2.length + 1];
		
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		
		arr3[4] = 5;
		
		for (int element : arr3) {
			System.out.println(element);
		}
		
		System.out.println("----------------------------------------");

		int[][] matrix = new int[][] { {1, 2, 3}, {4, 5, 6} };
		
		System.out.println("Matrix length = " + matrix.length);
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Matrix[" + i + "] length = " + matrix[i].length);
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("matrix["+ i + "]" + "[" + j + "] = " 
						+ matrix[i][j]);
			}
		}
		
		System.out.println("----------------------------------------");

		Student[] students = new Student[2];
				
		students[0] = new Student(1, "Jake", new float[] {7.5f, 8.7f});
		students[1] = new Student(2, "John", new float[] {5.5f, 7.7f});

		for (Student student : students) {
			System.out.println(student.toString());
			System.out.println("Average grade " + student.avgGrade());
		}
		
		System.out.println("----------------------------------------");
		
		int[] arr4 = new int[5];
		
		Arrays.fill(arr4, 6);
		for (int element : arr4) {
			System.out.println(element);
		}
		
	}

}
