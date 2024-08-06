package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateAndWrite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path");
		String path=sc.nextLine();
		
		try {
			FileOutputStream fo = new FileOutputStream(path, true);
			
			System.out.println("Enter the data");
			String Content=sc.nextLine();
			byte b[]=  Content.getBytes();
			
			fo.write(b);
			fo.close();
			 
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
