/*
 * �j��ԭz�m��
 * ���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C
 * @author Mark
 */
public class Interest {
	public static void main(String[] args) {
		double chienPrincipal = 100000, haoPrincipal = 100000, chienSum, haoSum; // Principal ����; Sum �`�M
		final double sInterest = 0.1, cInterest = 0.05;		// simple interest ��Q ;  compound interest �ƧQ
		int year = 1;
		
		while(true) {  /* �Q�εL�a�j�餣�_�p�����`���B�A�P�_�b�Y�z�~��A�q�����|�W�L������� */
			chienSum = chienPrincipal * (1 + sInterest * year);			// ��Q���C
			haoSum = haoPrincipal * Math.pow( (1 + cInterest), year);	// �ƧQ���C Math.pow(����, �����)�A����k�i�B�z����B��C
		    if(haoSum > chienSum) break;	// �Y�q�����j��������A�h���X�j��C
		    year++;
    	} //end of while
		System.out.println("�q�Ӻ⪺���b " + year + " �~��i�H�W�L���르�C��H���`�ұo���O��:");
		System.out.printf("���르: %.2f ��\t�q�Ӻ�: %.2f ��%n", chienSum, haoSum);			
	} // end of main()
} // end of class Interest
