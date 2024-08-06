package Java;

public class StringLearn {

	public static void main(String[] args) {
		String s1="Kiran";
		
		System.out.println("char at"+s1.charAt(2));
		
		String s2= new String("Java");
		
		String s3="learn";
		
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(s1.concat(s3).concat(s2));
		
		String s4="    Testing    ";
		System.out.println("Before trim :"+s4.length());

		System.out.println("After trim :"+s4.trim().length());
		
		String s5="helloworlf";
		System.out.println(s5.charAt(7));
		System.out.println("Contains Text :"+s5.contains("ll"));
		
		
		// equals
		
		String s6="java";
		String s7="Java";
		System.out.println("equals"+s6.equals(s7));
		System.out.println("ignore equals :"+ s6.equalsIgnoreCase(s7));
		
		
		//replace 
		String s8="XiranXumar";
		System.out.println("Replace char  :"+s8.replace('X', 'K'));
		
		
		//substring
		
		String s9="Training";
		System.out.println("SubString :"+s9.substring(1, 5));
		
		//Split
		
	//	/ + - . ? # (don't use)
		
		String s10="kiRAn@gamil";
		String arr[]=s10.split("@");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println("Uppercase  :"+s10.toUpperCase());
		
		System.out.println("lowercase  :" +s10.toLowerCase());
		
		
		String x1="welcome";
		String x2="welcome";
		String x3= new String("welcome");
		String x4= new String("Welcome");
		
		System.out.println("comp  :"+(x1==x2)); //true
		System.out.println("comp  :"+x1.equals(x2));//true
		
		System.out.println("comp1  :"+(x1==x3)); //false
		System.out.println("comp1 :"+x1.equals(x3)); //true
		
		System.out.println("comp2  :"+(x1==x4)); //false
		System.out.println("comp2 :"+x1.equals(x4)); //false
		
		//another Case
		
		String c1="abc";
		String c2= new String("abc");
		String c3=c2;
		
		System.out.println("comp3 :"+(c1==c2));  // false
		System.out.println("comp3  :"+c1.equals(c2));// true
		
		System.out.println("comp4 :"+(c1==c3));// false
		System.out.println("comp4  :"+c1.equals(c3));// true
		
		System.out.println("comp5 :"+(c2==c3));// true
		System.out.println("comp5  :"+c2.equals(c3));// true
		
		


	}

}
