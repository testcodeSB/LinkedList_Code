package Linkedlist_package;

public class LinkedListDelele {
	Node1 head;
	public void add(int data) {
		Node1 newN=new Node1(data);
		if(head==null)
			head=newN;
		else
		{
			Node1 currentN=head;
			while(currentN.next!=null) {
				currentN=currentN.next;
			}
			currentN.next=newN;
		}
	}
	
	public void delet1stele() {
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			head=head.next;
		}
	}
	
	public void deletMidele() {
		Node1 fast=head;
		Node1 slow=head;
		Node1 prev=head;
		if(fast==null)
			System.out.println("list is empty");
		else {
			while(fast!=null && fast.next!=null) {
				fast=fast.next.next;
				prev=slow;
				slow=slow.next;
			}
			prev.next=slow.next;
		}
			
	}
	
	public void deletLastele() {
		Node1 currentN=head;
		if(head==null)
			System.out.println("List is empty");
		else {
			while(currentN.next.next!=null) {
				currentN=currentN.next;
			}
			currentN.next=null;
		}
		
	}
	
	
	public void printList() {
		Node1 currentN=head;
		while(currentN!=null) {
			System.out.print(currentN.data+" ");
			currentN=currentN.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDelele list=new LinkedListDelele();
		
		list.add(20);
		list.add(9);
		list.add(10);
		list.add(7);
		list.add(5);
		
		list.delet1stele();
		list.deletMidele();
		list.deletLastele();
		list.printList();
	}

}
