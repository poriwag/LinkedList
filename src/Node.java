import java.util.Scanner;

public class Node {

	Node next;
	int data;
	
	//constructors
	public Node()
	{
		this.next = null;
		this.data = 0;
	}
	
	public Node(int d)
	{
		this.next = null;
		this.data = d;
	}
	
	//setters and getters
	public void setData(int d) {
		this.data = d;
	}
	public int getData() {
		return this.data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	public void display() {
		System.out.println(data);
	}
}
