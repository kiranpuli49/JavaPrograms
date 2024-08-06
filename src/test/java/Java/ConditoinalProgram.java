package Java;

public class ConditoinalProgram {

	public static void main(String[] args) {
		int x=5;
		if(x%2==0) {
			if(x<=2 && x<=5) {
				System.out.println("Not weird");
			}
			else if(x<=6 && x<=20){
				System.out.println(" weird");
			}
			else{
				System.out.println("Not weird");
			}
		}
		else {
			System.out.println("Not weird");
		}

	}

}
