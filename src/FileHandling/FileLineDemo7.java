package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLineDemo7 {

	public static void main(String[] args) {
		//will create file if doesn't exist for write
		try (
				FileReader fr = new FileReader("/Users/sayanashrestha/Desktop/demofile.txt"); //read this file in char
				FileWriter fw = new FileWriter("/Users/sayanashrestha/Desktop/write3.txt");
				BufferedReader br = new BufferedReader(fr); //reads line by line
				BufferedWriter bw = new BufferedWriter(fw); //writes line by line
		){
			String len;
			
			 //will read the file in form of line until the end of the file which is null
			while((len=br.readLine())!=null) {
				 System.out.println(len);
				 bw.write(len);
				 bw.newLine();
			 }
			
		}
		catch (IOException e) {
			e.printStackTrace();
		 }
	}

}
