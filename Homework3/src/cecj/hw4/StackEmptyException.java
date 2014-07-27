package cecj.hw4;

public class StackEmptyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public void getEmptyMsg() {
		System.out.println("\n Stack空間沒東西了.");
	}

}
