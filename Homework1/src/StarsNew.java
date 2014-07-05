
public class StarsNew {
	public static void starNew1() {
		for(int i = 0; i <= 4 ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void starNew2() {
		for(int i = 0; i <= 4 ; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void starNew3() {

	}
	
	public static void main(String[] args) {
		starNew1();
		System.out.println();
		starNew2();
		System.out.println();
				
	}
}
