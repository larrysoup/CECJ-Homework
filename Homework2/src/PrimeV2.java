/*
 * PrimeV2
 * 執行時經由參數輸入一整數，列印出所有小於或等於的質數。
 * 改以method做質數計算, 不使用陣列.
 *---------------------------------------------------*
 * V2
  * static boolean checkPrime(int num)
 *  此方法檢查所有小於等於使用者輸入值的整數是否為質數.
 *  STEP1) 使用for loop循序檢查每一個小於num的數能否和num整除, 若可被整除, 即表示num非質數. ( num % i == 0)
 *  STEP2) 可被整除者直接傳回FALSE; 不可被整除者即為質數, 傳回TRUE.
 *  
  * main()
 *  checkNum: 使用者輸入值.  count: 計數器, 紀錄質數個數.
 *  利用 for loop循序檢查小於等於使用者輸入值(checkNum)的每一個整數是否為質數, 為質數者即印出.
 *  STEP1) scanner.nextInt();
 *  STEP2) for (i = 2; i <= checkNum; i++)
 *  STEP3) if ( checkPrime(i) == true ) 印出. 計數器遞增.
 *---------------------------------------------------*
 * @author Mark
 */
import java.util.Scanner;

public class PrimeV2 {
		public static boolean checkPrime(int num) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) return false;
			}
			return true;
		} // end of method checkPrime
		
	public static void main(String[] args) {
		int checkNum, count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入一整數, 列出比其小的所有質數: ");
		checkNum = scanner.nextInt();
		
		for (int i = 2; i <= checkNum; i++) {
			if (checkPrime(i) == true) {
				System.out.print(i + ",  " );
				count++;
			}
		}
		System.out.printf("共有 %d 個質數.", count);
	} // end of main()
}
