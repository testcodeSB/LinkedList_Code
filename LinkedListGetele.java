package Linkedlist_package;

public class LinkedListGetele {
	
	Node1 head;
	public void add(int data) {
		Node1 NewNode=new Node1(data);
		if(head==null)
			head=NewNode;
		else {
			Node1 currentN=head;
			while(currentN.next!=null) {
				currentN=currentN.next;
			}
			currentN.next=NewNode;
		}
	}
	
	public void print1stele() {
		Node1 presentN=head;
		if(presentN==null)
			System.out.println("List is empty");
		else
			System.out.println(presentN.data);
	}
	
	public void printMidele() {
		Node1 fast=head;
		Node1 slow=head;
		if(fast==null) {
			System.out.println("List is empty");
		}
		else {
			
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
		}
	}
	
	public void printLastele() {
		Node1 currentN=head;
		if(currentN==null)
			System.out.println("List is empty");
		else {
			while(currentN.next!=null) {
				currentN=currentN.next;
				
			}
			System.out.println(currentN.data);
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
		LinkedListGetele list=new LinkedListGetele();
		list.add(20);
		list.add(8);
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(9);
		
		list.print1stele();
		list.printMidele();
		list.printLastele();
		list.printList();

	}

}
