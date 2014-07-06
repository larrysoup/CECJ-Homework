
public class Poker {	
	public static void main(String[] args) {
		int ranSuit, ranNo, temp;        // ranSuit 花色; ranNo 牌號; temp 容器
		int[] poker = new int [52];

		for(int i = 1; i <= poker.length; i++) {    // 將數字1至52以遞增順序放入陣列中
			poker[i-1] = i;
		}

		for(int i = 0; i < poker.length; i++) {
			/* 以亂數取Poker陣列的索引值, 將隨機取索引值之陣列中的值與原始陣列中的值兩兩交換, 達到洗牌的效果 */
			ranNo = (int) (Math.random()*52);
			temp = poker[i];
			poker[i] = poker[ranNo];
			poker[ranNo] = temp;
		}

		for(int i = 0; i < poker.length; i++) {
			if(i % 13 == 0) System.out.println();    // 每發完一組牌即換行.(13張牌)
			ranSuit = poker[i] / 13;
			switch(ranSuit) {    // 以商數判斷花色
			case 1:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "心");    // 13~25 紅心
				break;
			case 2:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "磚");    // 26~38 方塊(紅磚)
				break;
			case 3:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "桃");    // 39~51 黑桃
				break;
			default:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "花");    // 1~12&52 梅花
				break;
			} // end of switch
		} // end of outer for
	} // end of main()
} // end of class Poker
