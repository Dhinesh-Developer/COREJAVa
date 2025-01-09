package com.DhineshDevelop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		String path = "D:\\Files\\program2.txt";
		File file = new File(path);
		boolean x = false;
		try {
			x = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println(x);
		}
		
		FileWriter writer=null;
		try {
			writer = new FileWriter(file);
			writer.write("Hello World");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			try {
				System.out.println(reader.read());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
