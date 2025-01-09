package com.DhineshDevelop;

import java.io.File;
import java.io.IOException;

public class fileHandling1 {
    public static void main(String[] args) {
        String path = "D:\\1.txt"; // absolute Path
      //  String path1 = "D:\\w.txt";
        File file = new File(path);
        try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        System.out.println(file.canRead()); //true or false
        System.out.println(file.canWrite()); // true or false
        System.out.println(file.exists());  // true or false
        System.out.println(file.getName()); //name of the file
        System.out.println(file.getParent()); // get the directories of the file
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
//        try {
//			
//			File file1 = new File(path);
//			System.out.println(file.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
        System.out.println(file.mkdir());
//        String[] l = file.list();
//        for(String x:l) System.out.print(x+"	");
    }
}
