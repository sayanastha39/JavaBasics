package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		//file read and write each char of file in byte and give ASCII value
		FileInputStream fis = null; //because resource file so we need to close //read
		FileOutputStream fos = null; //write
		try {
			 fis = new FileInputStream("/Users/sayanashrestha/Desktop/demofile.txt"); //read this file
			 fos = new FileOutputStream("/Users/sayanashrestha/Desktop/write1.txt"); //write in this file 
			 int len;
		
				 //will read the file in form of byte until the end of the file and once end that means -1
				while((len=fis.read())!=-1) {
					 System.out.println(len);
					 fos.write(len);
				 }
		}
			 catch (IOException e) {
				e.printStackTrace();
			 }
		
		finally {
			 try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
