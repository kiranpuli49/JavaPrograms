package JavaPractice;


class A{
	String color="white";
	public void show() {
		System.out.println("parent-class:show");
	}
}
class child extends A{
	String color="black";
	public void show() {
		System.out.println("child-class color: "+color);
		System.out.println("parent-class color:"+super.color);
		super.show();
	}
}


public class supkeyword {

	public static void main(String[] args) {
		child c1 = new child();
		c1.show();

	}

}
