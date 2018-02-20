import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack1<T> {
	public final int INITIAL_SIZE =2;
	public int size;
	public int topIndex;
	public T[] storage;
	public ArrayStack() {
		storage = (T[]) new Object [INITIAL_SIZE];
		size=storage.length;
		topIndex=-1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return topIndex==-1;
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		return storage[topIndex];
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		topIndex = topIndex-1;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		topIndex = topIndex +1;
		if(topIndex >=size) {
			T[] top =storage;
			storage = (T[]) new Object[2*size];
			for(int i=0;i<topIndex;i++) {
				storage[i]=top[i];
			}
			size = storage.length;
		}
		storage[topIndex] = item;
	}
	public String toString() {
		String result = "[";
		for(int i=0;i<size;i++) {
			if(i>0) {
				result +=",";
			}
			result +=storage[i];
		}
		result +="]";
		return result;
	}

}
