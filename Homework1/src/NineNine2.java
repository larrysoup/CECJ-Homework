/*
 * �j��ԭz�m��
 * �L�X�i���E�E���k��C
 * @author Mark
 */
public class NineNine2 {
	public static void main(String[] args) {
		System.out.print("    |  ");		// �N���u�����}�L�X�C
		for(int i = 1; i <= 9; i++) {
			System.out.print("\t" + i);		// �L�X��椤�����ƶ� �A�çQ��tab����C
		}
		System.out.print("\n");
		for(int i = 0; i <= 10; i++) {
			System.out.print("-------");	// ���u��(���j�u)�C
		}
		System.out.print("\n");
		
		for(int j = 9; j >= 1; j--) {
			/* �N�Q���ƶ��P���n���}�L�X�C �Q���Ƭ�j�A���Ƭ�k */
			System.out.print(j + "   |  ");		// �L�X��椤���Q���ƶ��C
			for(int k = 1; k <= 9; k++) {
				if(k<=j) {
					System.out.print("\t" + (j*k));  // �L�X���n�A�åHtab����C
				} else {
					System.out.print( "\t" + " ");	 // �Y�����ƭ��n�A�h�H�ťզL�X�A�åHtab����C
				} // end of if...else
			}
			System.out.print("\n");
		} // end of outer for
	} // end of main()
} // end of class NineNine2
