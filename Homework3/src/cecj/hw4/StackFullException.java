package cecj.hw4;

public class StackFullException extends Exception {	
	private static final long serialVersionUID = 1L;

	public void getFullMsg() {
		System.out.println("\n Stack空間已爆了...!");
	}
}
