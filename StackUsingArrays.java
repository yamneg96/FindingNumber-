package stackUsingArrays;

public class StackUsingArrays {
	int[] numArray;
	int top;
	int size;
	public StackUsingArrays(int capacity) {
		numArray = new int[capacity];
		top = -1;
		size = 0;
	}
	public int size() {
		return size;
	}
	void push(int value) {
		if (top < numArray.length - 1) {
			numArray[++top] = value;
			size++;
		}
		else {
			System.out.println("Full");
		}
	}
	public int pop() {
		if (top >= 0) {
			int data = numArray[top--];
			size--;
			return data;
		}
		return -1;
	}
	public static void main(String[] args) {
		StackUsingArrays numStack = new StackUsingArrays(5);
		numStack.push(11);
		numStack.push(22);
		numStack.push(33);
		numStack.push(44);
		numStack.pop();
		numStack.pop();
		for (int i = 0; i < numStack.size; i++) {
			System.out.println(numStack.numArray[i]);
		}
	}
}