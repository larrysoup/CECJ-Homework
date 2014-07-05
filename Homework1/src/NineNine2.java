/*
 * 迴圈敘述練習
 * 印出進階九九乘法表。
 * @author Mark
 */
public class NineNine2 {
	public static void main(String[] args) {
		System.out.print("    |  ");		// 將表單線條分開印出。
		for(int i = 1; i <= 9; i++) {
			System.out.print("\t" + i);		// 印出表單中的乘數項 ，並利用tab對齊。
		}
		System.out.print("\n");
		for(int i = 0; i <= 10; i++) {
			System.out.print("-------");	// 表單線條(分隔線)。
		}
		System.out.print("\n");
		
		for(int j = 9; j >= 1; j--) {
			/* 將被乘數項與乘積分開印出。 被乘數為j，乘數為k */
			System.out.print(j + "   |  ");		// 印出表單中的被乘數項。
			for(int k = 1; k <= 9; k++) {
				if(k<=j) {
					System.out.print("\t" + (j*k));  // 印出乘積，並以tab對齊。
				} else {
					System.out.print( "\t" + " ");	 // 若有重複乘積，則以空白印出，並以tab對齊。
				} // end of if...else
			}
			System.out.print("\n");
		} // end of outer for
	} // end of main()
} // end of class NineNine2
