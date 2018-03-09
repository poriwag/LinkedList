
public class TheLinkedList {
	
	private int counter;
	private Node head;
	
	//default constructor
	public TheLinkedList() {
		this.head = null;
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	//append node to the list
	public void add(int data)
	{
		Node newNode = new Node(data);
		Node current = head;
		Node temp = null; 
		
		//empty list
		if (isEmpty())
		{
			head = newNode;
			//do not need to set next to null. Node constructor sets to null
		}
		//front of the list
		else if (head.getData() >= data)
		{
			newNode.setNext(head);
			head = newNode;
		}
		else
		{
			while (current != null && current.getData() < newNode.getData())
			{
				temp = current;
				current = current.getNext();
			}
				if (current != null)
				{
					newNode.setNext(current);
					temp.setNext(newNode);
				} //iff inserted at the end of the list
				else
				{
					temp.setNext(newNode);
					newNode.setNext(null);
				}
		}
		
		counter++;
	}
	
	void print()
	{
		Node current = head;
		
		System.out.print("head -> ");
		while (current != null)
		{
			System.out.print(current.getData() + " -> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
}
