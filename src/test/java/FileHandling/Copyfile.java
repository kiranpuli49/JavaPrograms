package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Copyfile {

	public static void main(String[] args) {
		File S= new File("C:\\Users\\kipuli\\Desktop\\SQL\\Day-1.txt");
		File D=new File("C:\\Users\\kipuli\\Desktop\\SQL\\Day-1COPY.txt");
		FileInputStream fi=null;
		FileOutputStream fo=null;
		try {
			fi= new FileInputStream(S);
			fo= new FileOutputStream(D);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		int i=0;
		 try {
			while((i=fi.read())!=-1) {
				
				fo.write(i);
				 
			 }
			fi.close();
			fo.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		 
	}

}
