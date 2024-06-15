package com.kedarnath;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAndWritingFiles {
	public static void main(String[] args) {
		//creating the file
		File file = new File("example.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File Created with name "+file.getName()+" in path "+file.getAbsolutePath());
			}
		} catch (IOException e) {
			System.out.println("File already Exists");
		}
		//writing into file
		try {
			FileWriter writer = new FileWriter("example.txt");
			writer.write("Hello, World!");
			writer.close();
			System.out.println("Content written to file successfully!!");
		} catch (IOException e) {
			System.out.println("Failed to write the content.");
			e.printStackTrace();
		}
		//reading and printing data
		try {
			File file2 = new File("example.txt");
			Scanner reader = new Scanner(file2);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
			System.out.println("Reading the file finished!!");
			
		} catch (Exception e) {
			System.out.println("Some error took place. Look in console.");
			e.printStackTrace();
		}
		
	}
}
