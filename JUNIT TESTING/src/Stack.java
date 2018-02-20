import java.util.EmptyStackException;

public class Stack {
	public int array[];
	public int maxSize;
	public int n = 0;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		array = new int[maxSize];
	}
	public void Push(int ele) {
		if(isFull()) {
			throw new StackOverflowError("Stack is full, you cannot enter more elements");
		}
		array[n] = ele;
		n++;
	}
	 boolean isFull() {
		// TODO Auto-generated method stub
		if (n == maxSize) {
		return true;
	}
		return false;
	}
	public int Pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return array[--n];
	}
	boolean isEmpty() {
		// TODO Auto-generated method stub
		if(n==0) {
			return true;
		}
		return false;
	}
	public int Peek() {
		if(n==0) {
			throw new EmptyStackException();
		}
		return array[n-1];
	}
}
