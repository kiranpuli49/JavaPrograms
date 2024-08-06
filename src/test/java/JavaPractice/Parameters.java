package JavaPractice;

public class Parameters {
		//no return type and no pramaters
		void show() {
			System.out.println("no parameters no return value");
		}
		// return type and with no parameters
		String show1() {
			String s = "no parameters- with  return type";
			return s;
		}
		//with parametrs and no return type
		void show2(String n) {
			System.out.println("Hello "+" "+n);
		}
		//with paramertes and with returntype
		String show3(String m) {
			return m;
		}
		public static void main(String[] args) {
		Parameters s4 = new Parameters();
		s4.show();
		System.out.println(s4.show1());
		s4.show2("Kiran");
		System.out.println(s4.show3("with paramertes and with return type"));

	}

}
