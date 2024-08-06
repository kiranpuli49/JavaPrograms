package Java;

public class Capital {

	public static void main(String[] args) {
		String str1 = "kiran kumar puli  bb";
		
		char str2[] = str1.toCharArray();
		boolean space= true;
		for(int i=0; i< str2.length;i++) {
			
			if(Character.isLetter(str2[i])) {
				if(space) {
					str2[i]= Character.toUpperCase(str2[i]);
					space=false;
				}
			}
			else {
				space= true;
			}
		}
       String message = String.valueOf(str2);
    		   System.out.println(message);
	}

}
