
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, count = 0, temp;	// count �}�C���ޭp��; temp �P�_��ƥΤ��׶q.
		int[] primeNo;
		
		System.out.print("�п�J�@�Ʀr: ");
		num = scanner.nextInt();
		System.out.println();
		primeNo = new int[ (num/2)+2 ];		// (num/2)+2�O�ثe�Q���ְ}�C�Ŷ��i�檺�覡���@, �٫ݧ�i.
		for(int i = num; i > 1 ; i--) { 	// ����Q����(����loop)
			temp = num;  // �]�w��l�׶q��
			for(int j = i - 1; j >= 2; j--) {  // �����(����loop)
				if(i % j == 0) {
					temp--;		// �Y���]��, �h�׶q�Ȼ���; �_�h�~��j��.
				} else {
					continue;
				} // end of if...else
			}
			if(temp == num) {	// �Y�׶q�ȥ�����, �h��ܦ��Ƭ����.
				primeNo[count] = i;
				count++;	// �}�C���ޭȻ��W, ���ݤU�@�ӽ�Ʀs�J.
			}
		} // end of outer for

		for(int i = 0; i < primeNo.length; i++) {
			if(primeNo[i] == 0) {
				System.out.printf("�@��%5d �ӽ��.%n", i);
				break;
			}
			System.out.print(primeNo[i] + " , ");
		}
	} // end of main()
} // end of class Prime
