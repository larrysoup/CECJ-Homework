/*
 * 綜合的練習-IDGenerator
 * 執行時經由參數輸入地區和性別，經由亂數產生一個身份証字號。
 * @author Mark
 */
import java.util.Scanner;

public class IDGenerator {
	static boolean checkValue(String str) {
		/* 檢查參數值正確性 */
		int checkHead;

		if (str.toLowerCase().equals("exit")) System.exit(0);
		String[] tokens = str.split(" ");
		tokens[0].toUpperCase();                // 將ID碼1轉為大寫字母
		char[] cArrays = str.toCharArray();
		checkHead = (int) cArrays[0];           // 將ID碼1轉為整數(ASCII)
		if (tokens.length == 2) {               // 檢查ID的碼1與碼2正確性
			if ( (checkHead >= 65 && checkHead <= 90) || (checkHead >= 97 && checkHead <= 122) ) { 
				if (tokens[1].toUpperCase().equals("M") || tokens[1].toUpperCase().equals("F")) {  
					return true;
				}
				else {
					System.out.println("您輸入的性別有誤, 請重新輸入.\n");
					return false;
				}
			} 
			else {
				System.out.println("您輸入的地區有誤, 請重新輸入.\n");
				return false;
			}
		}
		System.out.println("您輸入的格式長度有誤, 請重新輸入.\n");
		return false;
	} // end of method checkValue

	static void createID(String str) {
		/* 產生一組身分證字號 */
		int checkHead, ram, trans, sum;    // checkHead 碼1檢查, ram 亂數變數, trans 檢查碼變數
		String[] id = new String[10];
		int[] check = new int[8];          // 碼2~碼9存放陣列, 為計算出檢查碼用.

		String[] tokens = str.split(" ");
		checkHead = changeHead(tokens[0].toUpperCase());
		id[0] = tokens[0].toUpperCase();
		switch (tokens[1].toUpperCase()) {  // 存入ID碼2
		case "M": 
			check[0] = 1;
			id[1] = Integer.toString(check[0]);
			break;
		case "F":
			check[0] = 2;
			id[1] = Integer.toString(check[0]);
			break;
		}
		for (int i = 0; i < 7; i++) {         // 亂數產生7個0~9號數字, 並放入陣列中.
			ram = (int) (Math.random()*10);
			check[i+1] = ram;
			id[i+2] = Integer.toString(ram);
		}

		trans = (checkHead % 10) * 9 + (checkHead / 10);  // Step1. (個位數 * 9) + (十位數)
		sum = trans;
		for (int i = 1; i <= check.length; i++) {
			check[i-1] *= (9 - i);                        // Step2. 各數字從右至左依次乘上1~8
		}
		for (int values : check) {
			sum += values;                                // Step3.  Step1 與 Step2 的總和
		}
		trans = 10 - (sum % 10);                          // Step4. 10 - ( Step3總和除以10的餘數 )
		id[9] = Integer.toString(trans);                  // 放入檢查碼至ID陣列中.
		for (String values : id) {
			System.out.print(values);
		}
		System.out.println("  " + CheckID.checkID(id));   // 檢驗正確性
	} // end of method createID

	static int changeHead(String head) {            
		/* 傳回首碼(英文字母)對應之數字 */
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
	} //end of method changeHead

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);

		System.out.println("A 台北市    B 台中市    C 基隆市    D 台南市    E 高雄市    F 台北縣    G 宜蘭縣");
		System.out.println("H 桃園縣    I 嘉義市    J 新竹縣    K 苗栗縣    L 台中縣    M 南投縣    N 彰化縣");
		System.out.println("O 新竹市    P 雲林縣    Q 嘉義縣    R 台南縣    S 高雄縣    T 屏東縣    U 花蓮縣");
		System.out.println("V 台東縣    W 金門縣    X 澎湖縣    Y 陽明山    Z 連江縣");
		System.out.println("------------------------------------------------");
		while (true) {
			System.out.print("請輸入您的地區(見上列)與性別(M/F), 離開請輸入exit: ");
			str = scanner.nextLine();
			if(checkValue(str)) {    // 檢查參數正確性
				createID(str);       // 產生一組身份證字號
				System.out.println();
			}
			else if (str.toLowerCase().equals("exit")) {
				scanner.close();
				System.exit(0);
			}
		} // end of infinite while loop
	} // end of main()
} // end of class IDGenerator