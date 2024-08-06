package Java;

public class wordRev {

	public static void main(String[] args) {
		String str1 = "Kiran Kumar Puli";
		String str2[] = str1.split(" ");
		String rev = "";
		for (int i = str2.length - 1; i >=0; i--) {

			rev = rev + str2[i];
			rev=rev+" ";
			
		}
		System.out.println(rev);
	}
}
