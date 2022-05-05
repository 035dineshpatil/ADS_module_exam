import java.util.*;
class RevLL{
	Node head;
	
	class Node{
		int data;
		Node next;
		Node temp;
		Node current;
		Node prev;
		
	Node(int d){
		data = d;
		next = null;
		temp = null;
	}	
	}
	addNode(int data){
		Node n = new Node(data);
		
		if (head==null){
			nead = n;
		}else {
			temp = head;
			
			while (temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	Node reverse (Node m){
		prev = null;
		current = m;
		next = null;
		
		while (current != null){
			next = current.next;
			current.next=prev;
			prev = current;
			current = next;
		}
		
	}
	void printLL(Node m){
		while (m!=null){
			System.out.println(m.data);
			m=m.next;
		}
	}
	public static void main(String [] args){
		RevLL rl = new RevLL();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for (int i=0;i<s;i++){
			
		}
	}
}