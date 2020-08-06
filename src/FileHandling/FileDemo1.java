package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		String path = "/Users/sayanashrestha/Desktop/write.txt";
		File f = new File(path);
		//createNewFile is checked exception so need try catch or throw 
		// public boolean createNewFile() throws IOException in File class
		try {
			if(f.createNewFile()) {
				System.out.println("file is created");
			}
			else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
