import java.util.Scanner;

public class CheckID {

	static boolean checkID(String[] id) {           // 身分證字號驗證
		int checkH, checkF, trans, sum;             // checkH 碼1檢查; checkF 身分證檢查碼(碼10); trans 檢查碼計算;
		int[] checkB = new int[8];                  // 用以存放碼1~碼9之陣列

		for(int i = 0; i < 8; i++) {
			checkB[i] = Integer.parseInt(id[i+1]);  // 將碼1~碼9字串轉為整數放進陣列中
		}
		checkF = Integer.parseInt(id[9]);           // 放入檢查碼
		checkH = changeHead(id[0]);                 // 將碼1的英文字母轉成整數放入.
		trans = (checkH % 10) * 9 + (checkH / 10);  // Step1. (個位數 * 9) + (十位數)
		sum = trans;
		for(int i = 1; i < (id.length-1); i++ ) {
			checkB[i-1] *= (9 - i);                 // Step2. 各數字從右至左依次乘上1~8
		}
		for(int values: checkB) {
			sum += values;                          // Step3.  Step1 與 Step2 的總和
		}
		trans = 10 - (sum % 10);                    // Step4. 10 - ( Step3總和除以10的餘數 )
		if(checkF == trans) return true;
		else 	return false;
	} // end of method checkID()

	static int changeHead(String head) {            // 傳回首碼(英文字母)對應之數字
		int checkH = 0;

		switch(head) {
		case "A":   checkH = 10;   break;
		case "B":   checkH = 11;   break;
		case "C":   checkH = 12;   break;
		case "D":   checkH = 13;   break;
		case "E":   checkH = 14;   break;
		case "F":   checkH = 15;   break;
		case "G":   checkH = 16;   break;
		case "H":   checkH = 17;   break;
		case "I":   checkH = 34;   break;
		case "J":   checkH = 18;   break;
		case "K":   checkH = 19;   break;
		case "L":   checkH = 20;   break;
		case "M":   checkH = 21;   break;
		case "N":   checkH = 22;   break;
		case "O":   checkH = 35;   break;
		case "P":   checkH = 23;   break;
		case "Q":   checkH = 24;   break;
		case "R":   checkH = 25;   break;
		case "S":   checkH = 26;   break;
		case "T":   checkH = 27;   break;
		case "U":   checkH = 28;   break;
		case "V":   checkH = 29;   break;
		case "W":   checkH = 32;   break;
		case "X":   checkH = 30;   break;
		case "Y":   checkH = 31;   break;
		case "Z":   checkH = 33;   break;
		}
		return checkH;
	}

	public static void main(String[] args) {
		String[] id = new String[10];
		int checkHead, count = 1;
		String str;
		Scanner scanner = new Scanner(System.in);

		while(count <= 10) {
			System.out.print("請輸入您的身分證字號: ");
			str = scanner.nextLine();
			String[] tokens = str.split("");
			if(tokens.length == 10) {               // 檢查ID格式長度
				char[] cArray = str.toCharArray();  // 將字串轉字元
				checkHead = (int) cArray[0];        // 放入頭碼(英文字母)
				if(checkHead >= 65 && checkHead <= 90 ) {   //檢查ID碼1格式
					if(tokens[1].equals("1") || tokens[1].equals("2")) {   // 檢查ID碼2格式
						for(int i = 0; i < tokens.length; i++) {
							id[i] = tokens[i];      // ID格式正確.
						}
						System.out.println(checkID(id) ? "正確!" : "錯誤!");   // 驗證ID正確性
					} 
					else {
						System.out.println("您輸入的格式有誤!(碼2)");
					}
				} 
				else {
					System.out.println("您輸入的格式有誤!(碼1)");
				}
			} 
			else {
				System.out.println("您輸入的格式長度有誤.");
			} // end of outer if..else
			count++;  // 計數
		} // end of while
	} // end of main()
} // end of chekID
