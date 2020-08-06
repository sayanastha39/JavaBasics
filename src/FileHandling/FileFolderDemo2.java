package FileHandling;

	import java.io.File;
	import java.io.IOException;

	public class FileFolderDemo2 {

		public static void main(String[] args) {
			String path = "/Users/sayanashrestha/Desktop/demo";
			File f = new File(path);
			if(f.mkdirs()) {
				System.out.println("folder is created");
			}
			else {
				System.out.println("folder already exist");
			}
		}

	}
