package eu.ase.lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

//		System.out.print("Please provide input: ");
//		String line = scanner.nextLine();
//		System.out.println(line);
//		
//		System.out.print("Please provide a number: ");
//		int a = scanner.nextInt();
//		System.out.println(a);
		
		
		try {
			scanner = new Scanner(new File("file.txt"));
			String lineFromFile = scanner.nextLine();
			System.out.println(lineFromFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			FileOutputStream fos = new FileOutputStream("newfile.txt");
			
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			BufferedWriter writer = new BufferedWriter(osw);
			
			writer.write("Hello world!");
			writer.write(10);
			writer.write("aaa");
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("newfile.txt");
			
			InputStreamReader isr = new InputStreamReader(fis);
			
			BufferedReader reader = new BufferedReader(isr);
			
			int a = reader.read();
			System.out.println(a);
			
//			String lineFromFile = reader.readLine();
//			System.out.println(lineFromFile);
//			
//			lineFromFile = reader.readLine();
//			System.out.println(lineFromFile);
//			
//			lineFromFile = reader.readLine();
//			lineFromFile = reader.readLine();
//			
			char[] charbuf = new char[6];
			reader.read(charbuf);
			
			System.out.println(new String(charbuf));
			
			for (char c : charbuf) {
				System.out.println(c);
			}
 			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
