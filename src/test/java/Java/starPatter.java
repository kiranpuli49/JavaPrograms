package Java;

public class starPatter {

	public static void main(String[] args) {
		int row = 6;

		for (int i= row-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=0; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print("*" + " ");  
		}  
		//throws the cursor in the next line after printing each line  
		System.out.println();  
		}  
	
	}
}