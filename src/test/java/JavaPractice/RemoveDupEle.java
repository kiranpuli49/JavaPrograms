package JavaPractice;

import java.util.Arrays;


public class RemoveDupEle {
	
	public static void main(String[] args) {
		
				int arr1[]= {1,2,3,3,4,5,4};
				Arrays.sort(arr1);
				int[] arr2 = new int[arr1.length];
				int j=0;
				arr2[j]=arr1[0];
				for(int i=0;i<arr2.length;i++) {
					if(arr1[i]!=arr2[j]) {
						arr2[++j]=arr1[i];
					}
				}
				//System(".out.println ");
		        for(int k=0;k<=j;k++) {
		        		System.out.print(arr2[k]+" ");
		        }		        	        		 
	}
}
