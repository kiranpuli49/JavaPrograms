package JavaPractice;

public class encap2 {

	private int a;
	private char c;
	private String s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

	
	public static void main(String[] args) {
		
		encap2 EP = new encap2();
		EP.setA(5);
		System.out.println(EP.getA());
		EP.setC('K');
		System.out.println(EP.getC());
		EP.setS("Kiran");
		System.out.println(EP.getS());


	}

}
