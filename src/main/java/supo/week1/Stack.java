package supo.week1;

class StackElement<T> {
	public final T value;
	public StackElement<T> next;
	
	StackElement(T value, StackElement<T> next) {
		this.value = value;
		this.next = next;
	}
}

public class Stack<T> {
	private StackElement<T> top;
	
	Stack() {
		top = null;
	}
	
	public void add(T value) {
		top = new StackElement<T>(value, top);
	}
	
	public T pop() throws Exception {
		if (top == null) {
			throw new Exception("The stack is empty");
		}
		T tmp = top.value;
		top = top.next;
		return tmp;
	}
}
