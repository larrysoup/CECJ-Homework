/*
 * 方法與陣列的練習-TwoDimArray
 * 以下a~d各小題皆以一方法來處理：為練習陣列的參數傳遞，陣列需定義為main()的區域變數，事先將12個數字置於一3 x 4的二維陣列中，列印各方法的結果。
 *   a. 計算所有數字的平均值
 *   b. 找出12個數字中最大的值
 *   c. 找出12個數字中最小的值
 *   d. 計算每組內4個數字的平均值
 *  @author Mark
 */
public class TwoDimArray {
	public static double average(int arr[][]) {		         // 算陣列所有數平均值
		int  sum = 0, count = 0;
		double result;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		} // end of outer for
		result = (double) sum / count;
		return result;
	} // end of method average
	
	public static double getAverage(int arr[][], int row) {	// 算陣列所有數平均值
		/* Overloading Method */
		int  sum = 0, count = 0;
		double result;
			
			for (int j = 0; j < arr[row].length; j++) {
				sum += arr[row][j];
				count++;
			}
		result = (double) sum / count;
		return result;
	} // end of overloading method average
	
	public static int getMax(int arr[][]) {
		int maxNum;
		
		maxNum = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxNum) {
					maxNum = arr[i][j];
				}
			}
		} // end of outer for
		return maxNum;
	} // end of method max
	
	public static int getMin(int arr[][]) {
		int minNum;
		
		minNum = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < minNum) {
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
		
		System.out.printf("平均: %.2f %n", average(arr) );
		System.out.printf("最大值: %d ， 最小值: %d%n", getMax(arr), getMin(arr) );
		for (int i=0; i < arr.length; i++) {
			System.out.printf("第 %d 組的平均為: %.2f %n", i+1, getAverage(arr, i));
		}
	} // end of main()
} // end of class TwoDimArray
