public class SinglyLinkedList{
	private Node head = null;
	private Node tail = null;

	private class Node{
		String data;
		Node next;

		private Node(String data){
			this.data = data;
			this.next = null;
		}

	}

	public void addNode(String data){
		Node node = new Node(data);
		if (head == null) {
			head = node ;
			tail = node ;
		}else{
			tail.next = node ;
			tail = node ;
		}
	}

	public void display(){
		Node current = head;
		if(current != null){
			while(current != null){
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public void reverse(){
		if(tail != null && head != null){
			Node prevTail = tail; 
			Node current = head;
			Node next = null;
			
			while(current != prevTail){
				prevTail.next = current;
				head = current.next;
				tail = current;
				current.next = null;
				if (next != null) {
					tail.next = next;
				}
				current = head;
				next = prevTail.next;
			}

		}
	}


	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addNode("1");
		sll.addNode("2");
		sll.addNode("3");
		sll.addNode("4");
		sll.addNode("5");
		sll.addNode("6");
		sll.addNode("7");
		sll.display();
		System.out.println(".........................");
		sll.reverse();
		sll.display();
	}
}