package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharOriented6 {

	public static void main(String[] args) {
		//will create file if doesn't exist for write
		try (
				FileReader fr = new FileReader("/Users/sayanashrestha/Desktop/demofile.txt"); //read this file in char
				FileWriter fw = new FileWriter("/Users/sayanashrestha/Desktop/write2 .txt") 
		){
			int len;
			
			 //will read the file in form of byte until the end of the file and once end that means -1
			while((len=fr.read())!=-1) {
				 System.out.println(len);
				 fw.write(len);
			 }
			
		}
		catch (IOException e) {
			e.printStackTrace();
		 }
	}

}
