/*
 * 選擇性敘述練習
 * 某老師給學生評語，分數分為80分以上(含)、60分(含)至80分和60分以下三種，操性分為”甲”、”乙”、”丙”三種，依據分數與操性共組成九種組合給評語。(評語自訂)
 * @author Mark
 */
public class Comment {
	public static void main(String[] args) {
		char conduct;	// 操行成績
		int grade;		// 學業分數
		
		for(int i = 1; i <= 10; i++) {
			/* 隨機亂數取學業分數和操行成績 */
			grade = (int) (Math.random() * 80 + 20); // 亂數取 20~100
			if(grade < 90) {
				if(grade >= 70) {
					conduct = '乙';
				} else {
					conduct = '丙';
				}
			} else {
				conduct = '甲';
			}
			
			System.out.print(i + " 號同學， 學業成績:" + grade + "\t\t操行成績: " + conduct );
			System.out.print("\t評語: ");
			switch(conduct) {
			/* 以操行成績為條件判斷分為甲、乙和丙三種成績 */
			case '甲':
				if(grade >= 80) {  		  // 學業分數高於80分(含)。
					System.out.println("總統");
				} else if(grade >= 60) {  // 學業成績介於60分至79分之間。
					System.out.println("市長");
				} else { 				  // 學業成績低於60分。
					System.out.println("局長");
				}
				break;
			case '乙':
				if(grade >= 80) {
					System.out.println("老闆");
				} else if(grade >= 60) {
					System.out.println("經理");
				} else {
					System.out.println("課長");
				}
				break;
			case '丙':
				if(grade >= 80) {
					System.out.println("天才");
				}else if(grade >= 60) {
					System.out.println("人才");
				} else {
					System.out.println("漢子");
				}
				break;
			default:
				break;
			} // end of switch
		} // end of outer for 
	} // end of main()
} // end of class Comment
