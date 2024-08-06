package JavaPractice;

public class Methodoverloading {
   
	int x;
	int y;
	double z;
	  Methodoverloading(int x,int y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
		double f= x+y+z;
		System.out.println(f);
		
	}
	
	public void add() {
		System.out.println("without parameters");
	}
	public void add(int a,int b) {
		x=a;
		y=b;
		int c=a+b;
		System.out.println("integer and integer :"+c);
	}
	public void add(int a,double b) {
		x=a;
		z=b;
		double c=a+b;
		System.out.println("integer and double : "+c);
	}
	public static void main(String[] args) {
		

		Methodoverloading ML= new  Methodoverloading(5,5,5.8);
		ML.add();
		ML.add(5, 5.5);
		ML.add(5, 5);
	}

}
