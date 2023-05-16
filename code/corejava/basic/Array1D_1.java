public class Array1D_1 {
	public static void main(String args[]) {

		//int age[] = new int[] {23,32,34,20,21};
		int age[] = {23,32,34,20,21};
		int lastIndex = age.length - 1;
		System.out.println(age.length);

		for(int i = 0 ; i<age.length ; i++) {
			System.out.println(age[i]);
		}

		System.out.println("============");

		for(int val : age)
		{
			System.out.println(val);			
		}
	}
}