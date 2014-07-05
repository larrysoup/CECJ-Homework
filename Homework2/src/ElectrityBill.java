
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
		System.out.print(" �p��a�x�ιq�п�J1�A�p��u�~�ιq�п�J2: ");
		kind = scanner.nextInt();
		System.out.print("�аݱz�ϥΪ��q�q(��): ");
		degree = scanner.nextInt();
		if( kind == 1) {
			price = familyElctrity(degree);
		} else {
			price = degree * 0.45;
		}
		System.out.printf("�z�Ҳ֭p���q�O��: %.2f ���C%n", price);
		
	} // end of main()
} // end of class ElectrityBill
