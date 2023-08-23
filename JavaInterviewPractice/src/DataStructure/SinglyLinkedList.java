package DataStructure;

public class SinglyLinkedList {

private static ListNode head;
	

	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public int length()
	{
		if(head==null)
		{
			return 0;
		}
		int count=0;
		ListNode current = head;
		while(current!=null)
		{
			current = current.next;
			count++;
			
		}
		System.out.println("length of LinkedList is :"+count);
		
		return count;
		
	}
	
	public void display()
	{
		ListNode current = head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current = current.next;			
		}
		
		System.out.println("null");
	}
	
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void insertLast(int value) 
	{
		ListNode current = head;
		while(current.next!=null)
		{
			current = current.next;			
		}
		
		ListNode newNode = new ListNode(value);
		current.next = newNode;
		
	}
	
	public static void main(String[]args)
	{
		SinglyLinkedList sll = new SinglyLinkedList();
		int count = 0;
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		//now we have four nodes and will connect together to form a chain
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		//sll.insertFirst(45);
		sll.insertLast(60);
		sll.display();
		sll.length();
		
	}
	
}


