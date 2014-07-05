/*
 * 迴圈敘述練習
 * 錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。
 * @author Mark
 */
public class Interest {
	public static void main(String[] args) {
		double chienPrincipal = 100000, haoPrincipal = 100000, chienSum, haoSum; // Principal 本金; Sum 總和
		final double sInterest = 0.1, cInterest = 0.05;		// simple interest 單利 ;  compound interest 複利
		int year = 1;
		
		while(true) {  /* 利用無窮迴圈不斷計算比較總金額，判斷在若干年後，郝的投資會超過錢的投資 */
			chienSum = chienPrincipal * (1 + sInterest * year);			// 單利投資。
			haoSum = haoPrincipal * Math.pow( (1 + cInterest), year);	// 複利投資。 Math.pow(底數, 次方數)，此方法可處理次方運算。
		    if(haoSum > chienSum) break;	// 若郝的投資大於錢的投資，則跳出迴圈。
		    year++;
    	} //end of while
		System.out.println("郝細算的投資在 " + year + " 年後可以超過錢精打。兩人的總所得分別為:");
		System.out.printf("錢精打: %.2f 元\t郝細算: %.2f 元%n", chienSum, haoSum);			
	} // end of main()
} // end of class Interest
