import java.util.*;
public class Assignment7_2 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 1; i <= 20; i++)
		queue.enqueue(i);
		while (!queue.empty())
		System.out.print(queue.dequeue() + " ");
	}
}

class Queue {
	private int[] elements;
	private int size;
	
	public Queue() {
		elements = new int[8];
	}
	
	void enqueue(int v) {
		if(elements.length==size) {
			int[] temp = new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++]=v;
	}
	
	int dequeue() {
		int n = elements[0];
		int[] temp = new int[elements.length-1];
		System.arraycopy(elements, 1, temp, 0, elements.length-1);
		System.arraycopy(temp, 0, elements, 0, elements.length-1);
		size--;
		return n;
	}
	
	boolean empty() {
		return size==0;
	}
	
	int getSize() {
		return size;
	}
}