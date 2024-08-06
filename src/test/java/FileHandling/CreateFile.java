package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		
		 String path="C:\\Users\\kipuli\\Desktop\\SQL\\HPI.txt";
		 
		 File s= new File(path);
		 
		  try {
			boolean x=s.createNewFile();
			if(x) {
				System.out.println("created");
			}
			else {
				System.out.println("Not Created Bro");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
	}

}
