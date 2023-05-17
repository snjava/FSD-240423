public class Array2D_2 {
	public static void main(String args[]) {
		
		double marks[][] = {
									{56,76,45,67},
									{65,67,56,87},
									{65,76,87,54}
								};
	
		System.out.println(marks.length); // 3 // total number of rows
		System.out.println(marks[0].length); // 4 // total number of column from 0th row 

		for(int r=0 ; r<=2 ; r++) {		// ROW
			for(int c=0 ; c<=3 ; c++) {	// Column
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}

		System.out.println("================");
		
		for(double arr[] : marks) { 	// ROW
			for(double val : arr) {		// Column
				System.out.print(val + "\t");
			}
			System.out.println();
		}	


	}
}