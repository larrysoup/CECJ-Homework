/*
 * ��ܩʱԭz�m��
 * �Y�Ѯv���ǥ͵��y�A���Ƥ���80���H�W(�t)�B60��(�t)��80���M60���H�U�T�ءA�ީʤ������ҡ��B���A���B�������T�ءA�̾ڤ��ƻP�ީʦ@�զ��E�زզX�����y�C(���y�ۭq)
 * @author Mark
 */
public class Comment {
	public static void main(String[] args) {
		char conduct;	// �ަ榨�Z
		int grade;		// �Ƿ~����
		
		for(int i = 1; i <= 10; i++) {
			/* �H���üƨ��Ƿ~���ƩM�ަ榨�Z */
			grade = (int) (Math.random() * 80 + 20); // �üƨ� 20~100
			if(grade < 90) {
				if(grade >= 70) {
					conduct = '�A';
				} else {
					conduct = '��';
				}
			} else {
				conduct = '��';
			}
			
			System.out.print(i + " ���P�ǡA �Ƿ~���Z:" + grade + "\t\t�ަ榨�Z: " + conduct );
			System.out.print("\t���y: ");
			switch(conduct) {
			/* �H�ަ榨�Z������P�_�����ҡB�A�M���T�ئ��Z */
			case '��':
				if(grade >= 80) {  		  // �Ƿ~���ư���80��(�t)�C
					System.out.println("�`��");
				} else if(grade >= 60) {  // �Ƿ~���Z����60����79�������C
					System.out.println("����");
				} else { 				  // �Ƿ~���Z�C��60���C
					System.out.println("����");
				}
				break;
			case '�A':
				if(grade >= 80) {
					System.out.println("����");
				} else if(grade >= 60) {
					System.out.println("�g�z");
				} else {
					System.out.println("�Ҫ�");
				}
				break;
			case '��':
				if(grade >= 80) {
					System.out.println("�Ѥ~");
				}else if(grade >= 60) {
					System.out.println("�H�~");
				} else {
					System.out.println("�~�l");
				}
				break;
			default:
				break;
			} // end of switch
		} // end of outer for 
	} // end of main()
} // end of class Comment
