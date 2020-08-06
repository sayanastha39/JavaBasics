package FileHandling;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		
		String path = "/Users/sayanashrestha/Desktop/demofile.txt";
		File f = new File(path);
		
		System.out.println(f.getName() );
		System.out.println(f.getAbsolutePath() );
		System.out.println(f.canRead() );
		System.out.println(f.canExecute() );
		f.setReadable(false);
		System.out.println(f.canRead());
		f.setReadOnly();
		System.out.println(f.canWrite () );
		System.out.println(f.isFile()); //to check if it is file or directory
		System.out.println(f.isDirectory());
		System.out.println(f.exists());
		System.out.println(f.getTotalSpace());
		
		String dest = "/Users/sayanashrestha/Desktop/rename.txt";
		File f2 = new File(dest);
		f.renameTo(f2);
		f2.delete();
	}

}
