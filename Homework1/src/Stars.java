/*
 * 迴圈敘述練習
 * 畫出三種排列的星星圖形；(1)左下直角三角形 。 (2)右上直角三角形。  (3)正三角形。
 * @author Mark
 */
public class Stars {

	public static void stars1() {
		for(int i = 0; i <= 4; i++) {		// row
			for(int j = 0; j <= 4; j++) {   // column
				if(j <= i) {
					/* 若 column小於等於row時，印出空白字元。否則，印出星號 */
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		} //end of outer for
		System.out.print("\n");
	} //end of Stars1()
	
	public static void stars2() {
		for(int i = 0; i <= 4; i++) {		//row
			for(int j = 0; j <= 4; j++) {   //column
				if(j < i) {
					/* 若 column小於row時，印出空白字元。否則，印出星號 */
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		} //end of outer for
		System.out.print("\n");
	} //end of Stars2()
	
	public static void stars3() {
		/* 利用5*5大小的兩個直角三角形拼成一個正三角形(5*10)  */
		for(int i = 0; i <= 4; i++) {	// row
			System.out.print(" ");		// 每一列的開頭印一個空白字串。
			for(int j = 4; j >= 1; j--) { // column
				if(j > i) {
					/* 印出左半邊直角三角形，若column大於row時，印出空白字元。否則，印出"*"(最後一列共4顆星號) */
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int k = 0; k <= 4; k++) { // column
				if(k <= i) {
					/* 印出右半邊直角三角形，若column大於row時，印出星號。否則，印出空白字元(最後一列共5顆星號) */
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} 
			System.out.print("\n");
		} //end of outer for
	} //end of Stars3()
	
	
	public static void main(String[] args) {
		System.out.println("(1)");
		stars1();  // 左下三角形
		System.out.println("(2)");
		stars2();  // 右上三角形
		System.out.println("(3)");
		stars3();  // 正三角形
	} // end of main()
} // end of class Stars
