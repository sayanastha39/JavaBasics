package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//after Java 8 finally was not mandatory to close resource connection 
//you could use try with resources try(){} to close connection automatically
public class FileDemo5 {

	public static void main(String[] args) {
		//file read and write each char of file in byte and give ASCII value
		
		try (
				FileInputStream fis = new FileInputStream("/Users/sayanashrestha/Desktop/demofile.txt"); //read this file in byte
				FileOutputStream fos = new FileOutputStream("/Users/sayanashrestha/Desktop/write1.txt"); //write in this file
				)
			
		
		{
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
		
	}

}
