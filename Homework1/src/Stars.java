/*
 * �j��ԭz�m��
 * �e�X�T�رƦC���P�P�ϧΡF(1)���U�����T���� �C (2)�k�W�����T���ΡC  (3)���T���ΡC
 * @author Mark
 */
public class Stars {

	public static void stars1() {
		for(int i = 0; i <= 4; i++) {		// row
			for(int j = 0; j <= 4; j++) {   // column
				if(j <= i) {
					/* �Y column�p�󵥩�row�ɡA�L�X�ťզr���C�_�h�A�L�X�P�� */
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		} //end of outer for
		System.out.print("\n");
	} //end of Stars1()
	
	public static void stars2() {
		for(int i = 0; i <= 4; i++) {		//row
			for(int j = 0; j <= 4; j++) {   //column
				if(j < i) {
					/* �Y column�p��row�ɡA�L�X�ťզr���C�_�h�A�L�X�P�� */
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		} //end of outer for
		System.out.print("\n");
	} //end of Stars2()
	
	public static void stars3() {
		/* �Q��5*5�j�p����Ӫ����T���Ϋ����@�ӥ��T����(5*10)  */
		for(int i = 0; i <= 4; i++) {	// row
			System.out.print(" ");		// �C�@�C���}�Y�L�@�Ӫťզr��C
			for(int j = 4; j >= 1; j--) { // column
				if(j > i) {
					/* �L�X���b�䪽���T���ΡA�Ycolumn�j��row�ɡA�L�X�ťզr���C�_�h�A�L�X"*"(�̫�@�C�@4���P��) */
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int k = 0; k <= 4; k++) { // column
				if(k <= i) {
					/* �L�X�k�b�䪽���T���ΡA�Ycolumn�j��row�ɡA�L�X�P���C�_�h�A�L�X�ťզr��(�̫�@�C�@5���P��) */
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} 
			System.out.print("\n");
		} //end of outer for
	} //end of Stars3()
	
	
	public static void main(String[] args) {
		System.out.println("(1)");
		stars1();  // ���U�T����
		System.out.println("(2)");
		stars2();  // �k�W�T����
		System.out.println("(3)");
		stars3();  // ���T����
	} // end of main()
} // end of class Stars
