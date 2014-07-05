
public class TwoDimArray {
	
	public static double average(int arr[][]) {		// 衡皚┮Τ计キА
		int  sum = 0, count = 0;
		double result;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		} // end of outer for
		result = (double) sum / count;
		return result;
	} // end of method average
	
	public static double average(int arr[][], int row) {	// 衡皚┮Τ计キА
		/* Overloading Method */
		int  sum = 0, count = 0;
		double result;
			
			for(int j = 0; j < arr[row].length; j++) {
				sum += arr[row][j];
				count++;
			}
		result = (double) sum / count;
		return result;
	} // end of overloading method average
	
	public static int max(int arr[][]) {
		int maxNum;
		
		maxNum = arr[0][0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > maxNum) {
					maxNum = arr[i][j];
				}
			}
		} // end of outer for
		return maxNum;
	} // end of method max
	
	public static int min(int arr[][]) {
		int minNum;
		
		minNum = arr[0][0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < minNum) {
					minNum = arr[i][j];
				}
			}
		} // end of outer for
		return minNum;
	} // end of method min
	
	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{1, 4, 2, 3},
			{7, 6, 5, 8},
			{11, 12, 9, 10}
		};
		
		System.out.printf("キА: %.2f %n", average(arr) );
		System.out.printf("程: %d  程: %d%n", max(arr), min(arr) );
		for(int i=0; i < arr.length; i++) {
			System.out.printf("材 %d 舱キА: %.2f %n", i+1, average(arr, i));
		}
	} // end of main()
} // end of class TwoDimArray
