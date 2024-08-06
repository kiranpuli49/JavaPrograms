package JavaPractice;


class parent{
	int a,b;
  public void display() {
	  System.out.println("parent-class:display");
  }
  public void show() {
	  System.out.println("parent-class:show");
  }
  public void add(int x,int y) {
	  System.out.println(x+y);
  }
}
class child1 extends parent{
	
	  public void show1() {
		  System.out.println("child-class:show1");
	  }	
}

class child2 extends parent{
	
	  public void show2() {
		  System.out.println("child-class:show2");
	  }	
}

public class Hyinhe {

	public static void main(String[] args) {
		
		child2 c2 = new child2();
		c2.show2();
		c2.display();
		c2.add(5, 5);
		child1 c1 = new child1();
		c1.show1();
		c1.display();
		c1.add(6,3);
	}

}
