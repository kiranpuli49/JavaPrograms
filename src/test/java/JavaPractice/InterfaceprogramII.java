package JavaPractice;

interface FirstInterface {
	  public void myMethod(); 
	}

	interface SecondInterface {
	  public void myOtherMethod(); 
	}

	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  public void myOtherMethod() {
	    System.out.println("Some other text...");
	  }
	}

	class InterfaceprogramII {
	  public static void main(String[] args) {
		FirstInterface  myObj = new DemoClass();
	    myObj.myMethod();
	    SecondInterface myObjj= new DemoClass();
	    myObjj.myOtherMethod();
	  }
	}