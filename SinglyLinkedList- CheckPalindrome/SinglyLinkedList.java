public class SinglyLinkedList{
	private int size = 0 ;
	private Node head = null;
	private Node tail = null;

	private class Node{
		int position;
		String data;
		Node next;

		private Node(String data){
			this.data = data;
			this.next = null;
			this.position = size - 1;
		}

	}

	public void addNode(String data){
		size++;
		Node node = new Node(data);
		if (head == null) {
			head = node ;
			tail = node ;
		}else{
			tail.next = node ;
			tail = node ;
		}
	}

	public String getNodeValue(int position){
		Node current = head ;
		String value = null;
		if(size>position){
			if(current != null){
				while(current != null){
					if (current.position == position) {
						value = current.data;
						break;
					}else{
						current = current.next;
					}
				}
			}
		}
		return value;
	}

	public void display(){
		Node current = head;
		if(current != null){
			System.out.print("[ ");
			while(current != null){
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println("]");
		}
	}

	public int size(){
		return size;
	}

	public boolean isPalindrome(){
		boolean isP = false;
		if(head != null){
			int currentPosition = 0;
			for (int i = 0; i <= size/2 - 1; i++) {
				if (!getNodeValue(i).equals(getNodeValue(size-1-i))) {
					isP = false;
					break;
				}else{
					isP = true;
				}
			}
		}
		return isP;
	}


	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addNode("r");
		sll.addNode("a");
		sll.addNode("c");
		sll.addNode("e");
		sll.addNode("c");
		sll.addNode("a");
		sll.addNode("r");
		sll.display();
		System.out.println("Is Palindrome? "+sll.isPalindrome());
	}
}