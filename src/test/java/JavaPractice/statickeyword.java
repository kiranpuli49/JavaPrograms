package JavaPractice;

public class statickeyword {
	int a;
	static int b;
	char c;
	static int d;
	static char e;
	
	public void show(int x, int y) {
		a=x;
		b=y;
		System.out.println(x+y);
		
	}
	static void show1(int x,int y, char c) {
		// bcz a is  not static
//		a=x;
		//bcz d is static we can use in static method
		d=x;
		b=y;
		e=c;
		System.out.println((x+y)+e);
		
		
	}	
	public static void main(String[] args) {
		
		statickeyword st = new statickeyword();
		st.show(5, 5);
		show1(5,5,'A');
		
	}

}
