package project2;

public class Stack {
	int stack[];
	int top;
	int stackSize;

	public Stack(int size) {
		super();
		this.stack = new int[size];
		this.top = -1;
		this.stackSize = size;
	}

	public void push(int value) {
		if (isStackFull()) {
			System.out.println("stack is full"+value);
		}
		stack[++top] = value;

	}

	public int pop() {
		if (isStackEmpty()) {
			System.out.println("stack is empty");
		}
		return stack[top--];

	}

	public int peek() {
		return stack[top];
	}

	public int size() {
		return top + 1;
	}

	private boolean isStackEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	private boolean isStackFull() {
		if (top == stackSize - 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack(10);
		st.push(9);
		st.push(10);
		st.push(11);
		st.pop();
		st.peek();
		System.out.println(st.isStackEmpty());
		System.out.println(st.isStackFull());

	}

}
