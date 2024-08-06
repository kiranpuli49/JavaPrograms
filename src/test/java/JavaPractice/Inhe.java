package JavaPractice;

class SuperClass {
  void methodSuper() {
    System.out.println("I am a super class method");
  }
}


class SubClass extends SuperClass {
  void methodSubclass() {
    System.out.println("I am a sub class method");
  }
}

class UltrasubClass extends SubClass{
	 void methodSubclass2() {
		    System.out.println("I am a ultrasubclass");
		  }
}
class Inhe {
  public static void main(String args[]) {
    UltrasubClass obj = new UltrasubClass();
    obj.methodSuper();
    obj.methodSubclass();
    obj.methodSubclass2();
    
    
  }
}