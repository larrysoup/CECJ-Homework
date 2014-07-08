import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, count = 0, temp;	// count 陣列索引計數; temp 判斷質數用之度量.
		int[] primeNo;
		
		System.out.print("請輸入一數字: ");
		num = scanner.nextInt();
		System.out.println();
		primeNo = new int[ (num/2)+2 ];		// (num/2)+2是目前想到減少陣列空間可行的方式之一, 還待改進.
		for(int i = num; i > 1 ; i--) { 	// 控制被除數(遞減loop)
			temp = num;  // 設定初始度量值
			for(int j = i - 1; j >= 2; j--) {  // 控制除數(遞減loop)
				if(i % j == 0) {
					temp--;		// 若有因數, 則度量值遞減; 否則繼續迴圈.
				} else {
					continue;
				} // end of if...else
			}
			if(temp == num) {	// 若度量值未改變, 則表示此數為質數.
				primeNo[count] = i;
				count++;	// 陣列索引值遞增, 等待下一個質數存入.
			}
		} // end of outer for

		for(int i = 0; i < primeNo.length; i++) {
			if(primeNo[i] == 0) {
				System.out.printf("共有%5d 個質數.%n", i);
				break;
			}
			System.out.print(primeNo[i] + " , ");
		}
	} // end of main()
} // end of class Prime
