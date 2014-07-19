/*
 * 陣列的練習-Rain
 * 在程式中事先給予五年十二個月的降雨量，執行時經由參數輸入一字串和一個整數，字串有”year”、”season”和”month”用以表示計算某年、某季或某月的平均降雨量，整數用以表示那一年、那一季或那一月，若無任何參數輸入，則表示計算六十個月的總平均降雨量。
 * 需做誤錯處理的部份：
 *   a. 輸入除了0或2個參數以外的
 *   b. 第一個參數輸入除了”year”、”season”和”month”以外的字串
 *   c. 第一個參數輸入”year”，而第二個參數輸入1至5以外的數字
 *   d. 第一個參數輸入”season”，而第二個參數輸入1至4以外的數字
 *   e. 第一個參數輸入”month”，而第二個參數輸入1至12以外的數字
 * @author Mark
 */

import java.util.Scanner;

public class Rain {
	static int YEAR = 5;     // 年
	static int SEASON = 4;   // 一年四季
	static int MONTH = 3;    // 一季三個月
	static int ALL = 60;     // 五年月總數

	public static double rainfallAvg(String period, int time) {    // 計算降雨量平均
		double avg = 0;
		double sum = 0;
		int seasonRange;

		double[][][] rainfall = new double[][][] {
				{ {6.0, 3.0, 2.5}, {5.0, 0.5, 2.5}, {7.0, 2.0, 0.0}, {8.5, 4.0, 2.5} },
				{ {8.0, 3.0, 2.5}, {2.0, 0.5, 2.5}, {7.0, 10.0, 0.0 }, {8.5, 4.0, 1.5} },
				{ {2.0, 3.0, 2.5}, {6.0, 0.5, 2.5}, {7.0, 9.0, 0.0}, {8.5, 4.0, 0.5} },
				{ {3.0, 3.0, 2.5}, {10.0, 0.5, 2.5}, {7.0, 0.5, 0.0 }, {8.5, 4.0, 1.5} },
				{ {1.0, 3.0, 2.5}, {4.0, 0.5, 2.5}, {7.0, 2.0, 0.0}, {8.5, 4.0, 0.0} }
		};

		switch (period) {                             // 判斷範圍
		case "year":
			/* 計算當年平均降雨量 */
			for (int j = 0; j < SEASON; j++) {
				for (int k = 0; k < MONTH; k++) {
					sum += rainfall[time-1][j][k];
				}
			}
			avg = sum / (MONTH * 4);                  // 一年 = 12個月
			break;
		case "season":
			/* 計算當季總平均降雨量(歷年當季總和) */
			for (int i = 0; i < YEAR; i++) {
				for (int k = 0; k < MONTH; k++) {
					sum += rainfall[i][time-1][k];
				}
			}
			avg = sum / (MONTH * 5);                  // 5季 = 15個月
			break;
		case "month":
			/* 計算當月總平均降雨量(歷年當月總和) */
			seasonRange =  (time - 1) / 3;                  // 哪一季
			for (int i = 0; i < YEAR; i++) {
				sum += rainfall[i][seasonRange][(time - 1) % 3];
			}
			avg = sum / YEAR;
			break;	
		default:
			/* 所有月份降雨量總和 */
			for (double[][] ele : rainfall) {
				for (double[] rows : ele) {
					for (double values : rows) {
						sum += values;
					}
				}
			}
			avg = sum / ALL ;
			break;
		}
		return avg;
	} // end of method rainfallAvg

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str, period = null;                    // str 使用者輸入參數; period 範圍
		int time = 0;
		double AVG;

		while (true) {
			System.out.print("請依照格式輸入欲查詢的範圍與時間, 兩參數之間以空格隔開(period time):");
			str = scanner.nextLine();
			String[] tokens = str.split(" ");
			if (tokens.length > 1) {                  // 將使用者輸入之參數存入變數
				period = tokens[0];
				time = Integer.parseInt(tokens[1]);
			} 
			else if ( str.equals("") ){               // 使用者輸入0個參數, 計算降雨量總平均
				period = "all";
				AVG = rainfallAvg(period, time);
				System.out.println("總平均雨量為: " + AVG);
				continue;
			}

			if (tokens.length == 2 ) {                // 檢查使用者輸入參數正確性
				if ( period.equals("year") || period.equals("season") || period.equals("month") ) {
					if ( period.equals("year") && (time>=1 && time<=5) ) {
						AVG = rainfallAvg(period, time);
						System.out.printf("第 %d 年的平均雨量為: %f %n", time, AVG);
					} 
					else if ( period.equals("season") && (time>=1 && time<=4) ) {
						AVG = rainfallAvg(period, time);
						System.out.printf("第 %d 季的總平均雨量為: %f %n", time, AVG);
					} 
					else if ( period.equals("month") && (time>=1 && time<=12) ) {
						AVG = rainfallAvg(period, time);
						System.out.printf(" %d 月的總平均雨量為: %f %n", time, AVG);
					} 
					else {
						System.out.println("您輸入的時間有誤, 請重新輸入.");
					}
				} 
				else {
					System.out.println("您輸入的範圍有誤, 請重新輸入.");
				}
			} 
			else {
				System.out.println("您輸入的參數有誤, 重新輸入請按Y, 離開請輸入exit");
				str = scanner.nextLine();
				if (str.toLowerCase().equals("exit")) {
					scanner.close();
					System.exit(0);
				}
				else continue;
			} // end of outer if..else
		} // end of while
	} // end of main()
} // end of class Rain