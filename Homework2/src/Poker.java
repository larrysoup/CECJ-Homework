
public class Poker {	
	public static void main(String[] args) {
		int ranSuit, ranNo, temp;        // ranSuit ���; ranNo �P��; temp �e��
		int[] poker = new int [52];

		for(int i = 1; i <= poker.length; i++) {    // �N�Ʀr1��52�H���W���ǩ�J�}�C��
			poker[i-1] = i;
		}

		for(int i = 0; i < poker.length; i++) {
			/* �H�üƨ�Poker�}�C�����ޭ�, �N�H�������ޭȤ��}�C�����ȻP��l�}�C�����Ȩ��洫, �F��~�P���ĪG */
			ranNo = (int) (Math.random()*52);
			temp = poker[i];
			poker[i] = poker[ranNo];
			poker[ranNo] = temp;
		}

		for(int i = 0; i < poker.length; i++) {
			if(i % 13 == 0) System.out.println();    // �C�o���@�յP�Y����.(13�i�P)
			ranSuit = poker[i] / 13;
			switch(ranSuit) {    // �H�ӼƧP�_���
			case 1:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "��");    // 13~25 ����
				break;
			case 2:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "�j");    // 26~38 ���(���j)
				break;
			case 3:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "��");    // 39~51 �®�
				break;
			default:
				System.out.printf("%2d%s  ", poker[i]%13 + 1, "��");    // 1~12&52 ����
				break;
			} // end of switch
		} // end of outer for
	} // end of main()
} // end of class Poker
