package project2;

public class Queue {
	int arr[];
	int rear;
	int front;
	int capacity;
	int currentSize;
	public Queue(int size) {
		this.arr = new int[size];
		this.rear = -1;
		this.front = 0;
		this.capacity = size;
		this.currentSize = 0;
		
	}
	public void enqueue(int value) {
		if(isQueueFull()) {
			System.out.println("Queue overflow "+value);
		}else {
			rear++;
			if(rear == capacity-1) {
				rear = 0;
			}
			arr[rear] = value;
			currentSize++;
			
		}
	}
	public int dequeue() {
		if(isQueueEmpty()) {
			System.out.println("Queue underflow");
			front++;
			if(front == capacity-1) {
				System.out.println("removing element "+arr[front-1]);
				front = 0;
			}else {
				System.out.println("removing the element "+arr[front-1]);
				
			}
			currentSize--;
		}
		return 0;
	}
	public int size() {
		return currentSize;
	}
	public boolean isQueueEmpty() {
		return currentSize == 0;
	}
	public boolean isQueueFull() {
		return currentSize == capacity;
	}

	public static void main(String[] args) {
  Queue q = new Queue(10);
  q.enqueue(10);
  q.enqueue(14);
  q.enqueue(18);
  q.dequeue();
	}

}
