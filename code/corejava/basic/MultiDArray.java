public class MultiDArray {
	public static void main(String args[]) {
		int arr[][] = {
							{34,54,67,87},	
							{23,43},
							{34,56,78,1,2,3}
						};
		System.out.println(arr[1].length);

		for(int ar[] : arr) {
			for(int val : ar) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}

	}
}