import java.util.Scanner;

public class Rain {
	static int YEAR = 5;     // �~
	static int SEASON = 4;   // �@�~�|�u
	static int MONTH = 3;    // �@�u�T�Ӥ�
	static int ALL = 60;     // ���~���`��

	public static double rainfallAvg(String period, int time) {    // �p�⭰�B�q����
		double avg = 0;
		double sum = 0;
		int group;
		//		double[][] rainfall = new double[][] {
		//				{6.0, 3.0, 2.5, 6.0, 0.5, 2.5, 7.0, 10.0, 0.0, 8.5, 4.0, 3.5}, 	
		//				{8.0, 3.0, 2.5, 6.0, 0.5, 2.5, 7.0, 10.0, 0.0, 8.5, 4.0, 3.5}, 	
		//				{12.0, 3.0, 2.5, 6.0, 0.5, 2.5, 7.0, 10.0, 0.0, 8.5, 4.0, 3.5}, 	
		//				{3.0, 3.0, 2.5, 6.0, 0.5, 2.5, 7.0, 10.0, 0.0, 8.5, 4.0, 3.5}, 	
		//				{1.0, 3.0, 2.5, 6.0, 0.5, 2.5, 7.0, 10.0, 0.0, 8.5, 4.0, 3.5}, 	
		//		};

		double[][][] rainfall = new double[][][] {
				{ {6.0, 3.0, 2.5}, {5.0, 0.5, 2.5}, {7.0, 2.0, 0.0}, {8.5, 4.0, 2.5} },
				{ {8.0, 3.0, 2.5}, {2.0, 0.5, 2.5}, {7.0, 10.0, 0.0 }, {8.5, 4.0, 1.5} },
				{ {2.0, 3.0, 2.5}, {6.0, 0.5, 2.5}, {7.0, 9.0, 0.0}, {8.5, 4.0, 0.5} },
				{ {3.0, 3.0, 2.5}, {10.0, 0.5, 2.5}, {7.0, 0.5, 0.0 }, {8.5, 4.0, 1.5} },
				{ {1.0, 3.0, 2.5}, {4.0, 0.5, 2.5}, {7.0, 2.0, 0.0}, {8.5, 4.0, 0.0} }
		};

		switch(period) {    // �P�_�d��
		case "year":
			/* �p���~�������B�q */
			for(int j = 0; j < SEASON; j++) {
				for(int k = 0; k < MONTH; k++) {
					sum += rainfall[time-1][j][k];
				}
			}
			avg = sum / (MONTH * 4);    // �@�~ = 12�Ӥ�
			break;
		case "season":
			/* �p���u�`�������B�q(���~��u�`�M) */
			for(int i = 0; i < YEAR; i++) {
				for(int k = 0; k < MONTH; k++) {
					sum += rainfall[i][time-1][k];
				}
			}
			avg = sum / (MONTH * 5);    // 5�u = 15�Ӥ�
			break;
		case "month":
			/* �p�����`�������B�q(���~����`�M) */
			group =  (time - 1) / 3;    /* ���@�u */
			time -= (3 * group);    /* �u���ĴX�Ӥ�� */
			for(int i = 0; i < YEAR; i++) {
				sum += rainfall[i][group][time-1];
			}
			avg = sum / YEAR;    // �@��5�~
			break;	
		default:
			/* �Ҧ�������B�q�`�M */
			for(double[][] ele : rainfall) {
				for(double[] rows : ele) {
					for(double values : rows) {
						sum += values;
					}
				}
			}
			avg = sum / ALL ;    // 60�Ӥ�
			break;
		}
		return avg;
	} // end of method rainfallAvg()

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str, period = null;    // str �ϥΪ̿�J�Ѽ�; period �d��
		int time = 0;    // time �ɶ�
		double AVG;

		while(true) {
			System.out.print("�Ш̷Ӯ榡��J���d�ߪ��d��P�ɶ�, ��ѼƤ����H�Ů�j�}(period time):");
			str = scanner.nextLine();
			String[] tokens = str.split(" ");
			if(tokens.length > 1) { // �N�ϥΪ̿�J���ѼƦs�J�ܼ�
				period = tokens[0];
				time = Integer.parseInt(tokens[1]);
			} else if( str.equals("") ){  // �ϥΪ̿�J0�ӰѼ�, �p�⭰�B�q�`����
				period = "all";
				AVG = rainfallAvg(period, time);
				System.out.println("�`�����B�q��: " + AVG);
				continue;
			}

			if(tokens.length == 2 ) {    // �ˬd�ϥΪ̿�J�Ѽƥ��T��
				if( period.equals("year") || period.equals("season") || period.equals("month") ) {
					if( period.equals("year") && (time>=1 && time<=5) ) {
						AVG = rainfallAvg(period, time);
						System.out.printf("�� %d �~�������B�q��: %f %n", time, AVG);
					} else if( period.equals("season") && (time>=1 && time<=4) ) {
						AVG = rainfallAvg(period, time);
						System.out.printf("�� %d �u���`�����B�q��: %f %n", time, AVG);
					} else if( period.equals("month") && (time>=1 && time<=12) ) {
						AVG = rainfallAvg(period, time);
						System.out.printf(" %d �몺�`�����B�q��: %f %n", time, AVG);
					} else {
						System.out.println("�z��J���ɶ����~, �Э��s��J.");
					}
				} else {
					System.out.println("�z��J���d�򦳻~, �Э��s��J.");
				}
			} else {
				System.out.println("�z��J���ѼƦ��~, ���s��J�Ы�Y, ���}�п�JN.");
				str = scanner.nextLine();
				if( str.toUpperCase().equals("N") ) break;
				else continue;
			} // end of outer if..else
		} // end of while
	} // end of main()
} // end of class Rain