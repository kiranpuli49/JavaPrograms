package Java;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int z[]= {1,2,3,4,5};
		int max =z[1];
		int temp = 0;
	/* for (int i = 0 ; i < z.length- 1; i++)
		  {
		    for (int j = 0 ; j < z.length - i - 1; j++)
		    {
		      if (z[j] > z[j+1])
		      {
		        temp = z[j];
		        z[j] = z[j+1];
		        z[j+1] = temp;
		      	
		}
		    }
		  }*/
		Arrays.sort(z);
		 System.out.println(z[1]);
	}

}
