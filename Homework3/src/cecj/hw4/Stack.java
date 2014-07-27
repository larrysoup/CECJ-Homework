package cecj.hw4;

public class Stack {
	final static int STACK_SCOPE = 5;
	private int[] stackArray = new int[STACK_SCOPE];
	private int top = 0;


	public void push(int num) throws StackFullException {
			if (top >= stackArray.length) 
				throw new StackFullException();
			stackArray[top] = num;
			top++;
		}

		public void pop() throws StackEmptyException {
			if (top <= 0)
				throw new StackEmptyException();
			System.out.printf(" %d ", stackArray[top-1]);
			top--;
		}

		public int getTop() {
			return top;
		}

		public static void main(String[] args) {
			Stack ary = new Stack();
			int num;
			try {
				for(int i = 1; i <= STACK_SCOPE; i++) {
					num = i * 10;
					ary.push(num);
					System.out.printf(" %d ", num);
				}
				System.out.println();
				for(int i = 1; i <= STACK_SCOPE; i++)
					ary.pop();
			} catch(StackEmptyException e) {
				e.getEmptyMsg();
			} catch(StackFullException e) {
				e.getFullMsg();
			}
		}
	}
