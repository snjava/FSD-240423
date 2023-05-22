public class StringDemo3 {
	public static void main(String args[])
	{
		String name = "Abc Lmn Xyz";
		int count = name.length();
		System.out.println(count);
		
		String str1 = name.toUpperCase();
		System.out.println(str1);
		System.out.println(name.toLowerCase());

		String str2 = " ";
		System.out.println(str2.isEmpty());

		String str3 = "Welcome";

		System.out.println(str3.charAt(1));
		System.out.println(str3.indexOf('e'));

		String str4 = "img.pdf";
		System.out.println(str4.endsWith(".jpeg"));
		System.out.println(str4.startsWith("img"));

		String str5 = "    Abc Xyz     ";
		System.out.println(str5.trim());

		String str6 = "Hello";
		char ch[] = str6.toCharArray();
		
		for(int i = ch.length-1 ; i>=0 ; i--) {
			System.out.println(ch[i]);
		}
		
		String st[] = name.split(" "); //Abc Lmn Xyz
		for(String val : st) {
			System.out.println(val);
		}

		String str7 = "Hello user welcome to the home page";
		System.out.println(str7.contains("test"));

		String fname = "Demo1";
		String lname = " Demo2";
		//String fullName = fname.concat(lname);
		String fullName = fname + lname;
		System.out.println(fullName);

		int a = 10;
		int b = 20;
		System.out.println("Add : " + (a + b));
		
	}
}













