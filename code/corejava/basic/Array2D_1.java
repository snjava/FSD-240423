public class Array2D_1 {
	public static void main(String args[]) {

		double marks[][] = new double[3][4];

		marks[0][0] = 56.54;
		marks[0][1] = 62.51;
		marks[0][2] = 87.00;
		marks[0][3] = 46.41;

		marks[1][0] = 61.54;
		marks[1][1] = 52.51;
		marks[1][2] = 77.00;
		marks[1][3] = 56.41;

		marks[2][0] = 51.54;
		marks[2][1] = 65.51;
		marks[2][2] = 81.00;
		marks[2][3] = 43.41;
	
		for(int r=0 ; r<=2 ; r++) {
			for(int c=0 ; c<=3 ; c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
	}
}






