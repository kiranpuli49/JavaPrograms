package JavaPractice;

interface Animal {
	  public void animalSound(); 
	  public void sleep(); 
	}

	
	class Pig implements Animal {
	  public void animalSound() {
	    
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    
	    System.out.println("Zzz");
	  }
	}


public class interfaceprogram {

	public static void main(String[] args) {
		Pig pg = new Pig();
		pg.animalSound();
		pg.sleep();

	}

}
