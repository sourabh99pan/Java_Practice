package DataStructure;

public class SinglyLL_Practice {
	
	private static Node head;
	
	private static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public static void display()
	{
		Node current = head;
		
		while(current!=null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void firstNode(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public static void lastNode(int data)
	{
		Node current = head;
		
		while(current.next!=null)
		{
			System.out.println(current);
			//System.out.println(current.next);
			current = current.next;
		}
		
		Node newNode = new Node(data);
		current.next = newNode;
		
	}
	public static void main(String[] args) {

		SinglyLL_Practice sll = new SinglyLL_Practice();
		
		sll.head = new Node(10);
		
		Node second = new Node(11);
		Node third = new Node(12);
		Node fourth = new Node(13);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		
		//firstNode(9);
		lastNode(14);
		display();
		
		

		
		
	}

}
