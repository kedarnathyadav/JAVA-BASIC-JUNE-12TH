package com.kedarnath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOInputOutputTask19 {
	public static void main(String[] args) {
		String filePath = "students.txt";
		
		//write to file
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
			writer.write("Name, Age\r\n"
					+ "John Doe, 20\r\n"
					+ "Jane Doe, 22\r\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read from file
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line =reader.readLine()) !=null) {
				System.out.println(line);
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
