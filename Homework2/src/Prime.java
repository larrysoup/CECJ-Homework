/*
 * 迴圈與陣列的練習-Prime
 * 執行時經由參數輸入一整數，列印出所有小於或等於的質數。
 *---------------------------------------------------*
 * V1
 * 利用陣列將小於等於使用者輸入值的整數存進去, 再以遞減的方式印出.
 * primeNo[]: 存放質數的Array.   num: 使用者輸入的值.   temp: 設定一個標準值, 若其值減少, 表示能被整除, 即此不是質數.
 * STEP1) 以num做為被除數(i = num), 並遞減的方式進入for outer loop, 並定義標準值(temp = num).
 * STEP2) 除數小於被除數1(j = i-1)進入for inner loop, 判斷若兩數可整除, 則標準值-1; 若無法整除則繼續loop, 直到跳出 for inner loop.
 * STEP3) 判斷若標準值沒有減少(temp == num), 則將此數放入存放質數的Array中(primeNo[]), 並遞增Array索引值(count++).
 * STEP4) 離開for outer loop, 印出質數Array中的所有整數.
 *---------------------------------------------------*
 * @author Mark
 */
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, count = 0, temp;	             // count 陣列索引計數; temp 判斷質數用之度量.
		int[] primeNo;
		
		System.out.print("請輸入一數字: ");
		num = scanner.nextInt();
		System.out.println();
		primeNo = new int[ (num/2)+2 ];		     // (num/2)+2是目前想到減少陣列空間可行的方式之一, 還待改進.
		for (int i = num; i > 1 ; i--) { 	     // 控制被除數(遞減loop)
			temp = num;  					     // 設定初始度量值
			for (int j = i - 1; j >= 2; j--) {    // 控制除數(遞減loop)
				if (i % j == 0) {
					temp--;
				}
				else {
				    continue;
				}
			}
			if (temp == num) {
				primeNo[count] = i;
				count++;
			}
		} // end of outer for

		for (int i = 0; i < primeNo.length; i++) {
			if (primeNo[i] == 0) {
				System.out.printf("共有%5d 個質數.%n", i);
				break;
			}
			System.out.print(primeNo[i] + " , ");
		}
		scanner.close();
	} // end of main()
} // end of class Prime
