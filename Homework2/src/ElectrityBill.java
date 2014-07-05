
import java.util.Scanner;

public class ElectrityBill {
	public static double familyElctrity(int degree) {
		double result = 1;

		if(degree > 540) {
			result = degree * 0.45;
		} else if(degree <= 540 && degree > 240) {
			result = degree * 0.25;
		} else {
			result = degree * 0.15;
		}
		return result;
	} // end of method familyElctrity
	
	public static void main(String[] args) {
		int degree;
		double price;
		int kind;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 計算家庭用電請輸入1，計算工業用電請輸入2: ");
		kind = scanner.nextInt();
		System.out.print("請問您使用的電量(度): ");
		degree = scanner.nextInt();
		if( kind == 1) {
			price = familyElctrity(degree);
		} else {
			price = degree * 0.45;
		}
		System.out.printf("您所累計的電費為: %.2f 元。%n", price);
		
	} // end of main()
} // end of class ElectrityBill
