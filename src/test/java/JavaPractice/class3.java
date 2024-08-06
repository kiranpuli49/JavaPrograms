package JavaPractice;

public class class3 {

	
		int id;
		String Name;
		String Address;
		public void display() {
			System.out.println(id+" "+Name+" "+Address);
		}
		void setdata(int id, String name, String Address) {
			this.id=id;
			this.Name=name;
		    this.Address=Address;
		}
	  	class3(int id, String name, String Address){
			this.id=id;
			this.Name=name;
		    this.Address=Address;
		}

		public static void main(String[] args) {
			class3 cs = new class3(1,"Kiran","HYD");
	//		cs.setdata(1, "Kiran_Puli", "BLR");
			cs.display();
			
		}

	}


