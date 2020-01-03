package DsAndAlgrithm;

import javax.management.RuntimeErrorException;

public class QueueTest {
 public static void main(String[] args) {
	//使用数组模拟队列
	 
}
}
class ArrayQueue{
	private int maxSize;
	private int front;
	private int rear;
	private int[]arr;
	
	public ArrayQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
		front = -1;//point to the head of queue
		rear = -1;//to the end including the last data
	}
	public boolean isFull() {
		return rear == maxSize-1;
	}
	public boolean isEmpty() {
		return rear == front;
	}
	public void addQueue(int n) {
		if(isFull()) {
			return;
		}
		rear++;
		arr[rear] = n;
	}
	//out of queue
	public int getQueue(){
	if(isEmpty()) {
		throw new RuntimeException("Queue is empty");
	}
	  front++;
	  return arr[front];
	 }	
	//show data front the queue
	public void showQueue() {
		if(isEmpty()) {
			return;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}
	}
	public int headQueue() {
		if(isEmpty()) {
			throw new RuntimeException("Empty");
		}
		return arr[front+1];
	}
	}

