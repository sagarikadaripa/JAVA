package linkedList;

public class LinkedList {

	Node head;
	
	public void insert(int data) {
		
		// When we insert data a NEW NODE is always created
		Node newNode  = new Node(); 
		//Whatever the user is passing the data it is getting stored in the newNode
		newNode.data = data; 
		newNode.next = null;
		
		//checking if the node that we are creating is the only node i.e we do no have any node previously created.In that case that will be 		the head
		if(head == null) {
			head = newNode;			
		}
		// the data will be inserted at the end of the linkedList. So to find the end of the linked List we need to create a temporary node 			that will help us to travel all the way to the end starting from the head.
		else { 
			Node tempNode = head;
			
			while(tempNode.next != null) {
				
				tempNode = tempNode.next; //if the head link is not null move to next node link. 
			}
			
			tempNode.next = newNode; //pointing to the new node created
			
		}
		
	}
	public void showData() {
		
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next; //moving to the next node
		}
		System.out.println(n.data);
	}
}

