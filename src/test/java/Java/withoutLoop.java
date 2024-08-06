package Java;

public class withoutLoop {
	
	public void Loop(int n) {
		if(n>0 && n<=100) {
			System.out.print(n+",");
			
			Loop(n+1);
		}
		
	}

	public static void main(String[] args) {
		 withoutLoop x = new  withoutLoop();
		 x.Loop(1);
	}

}
