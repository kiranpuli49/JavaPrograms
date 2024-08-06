package Java;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int Mul= x*x;		
		int rem,Sum=0;
		while(Mul!=0) {		
			Sum=Sum+Mul%10;
			Mul=Mul/10;		
		}
		if(Sum==x)
        System.out.println( x+" is Neon Number");
		else
		{System.out.println(+x +": is not Neon Number");}
	}}


