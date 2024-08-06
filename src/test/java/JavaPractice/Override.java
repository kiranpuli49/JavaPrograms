package JavaPractice;


class RBI{
	public void headq() {
		System.out.println("Default Headq: BLR");
	}
}
class axis extends RBI{
	public void headq() {
		System.out.println("Axis Headq: Noida");
	}
	
}
class HDFC extends RBI{
	public void headq() {
		System.out.println("HDFC Headq: HYD");
	}
	
}
class SBI extends RBI{
	public void headq() {
		System.out.println("SBI Headq: Delhi");
	}
	
}
class SBH extends RBI{
	
	
}


public class Override {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.headq();
		HDFC hdfc = new HDFC();
		hdfc.headq();
		SBH sbh = new SBH();
		sbh.headq();

	}

}
