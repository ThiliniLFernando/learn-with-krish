import javax.print.DocFlavor.READER;

/**
 * AUTHOR : Thilini Fernando
 * 
 **/
public class CircularQueue{
	private int FRONT = -1,REAR = -1;
	private int SIZE = -1;
	private int[] array;

	public CircularQueue(int size){
		this.SIZE = size;
		this.array = new int[size];
	}

	public boolean enQueue(int val){
		if (isFull()) {
			System.out.println("Circular Queue OverFlow");
			return false;
		}else{
			if (FRONT == -1) {
				FRONT = 0;
			}
			REAR = (REAR + 1)%(SIZE);
			array[REAR] = val;
			return true;
		}
	}

	public int deQueue(){
		if(isEmpty()){
			System.out.println("Circular Queue Empty");
			return -1;
		}else{
			int top = array[FRONT];
			if(FRONT == REAR){
				FRONT = -1;
				REAR = -1;
			}else{
				FRONT = (FRONT + 1)%(SIZE);
			}
			return top;
		}
	}

	public boolean isEmpty(){
		return FRONT == -1;
	}

	public boolean isFull() {
		if (FRONT == 0 && REAR == SIZE - 1) {
			return true;
		}else if (FRONT == REAR + 1) {
			return true;
		}else{
			return false;
		}
	}

	public int peek(){
		if (isEmpty()) {
			System.out.println("Circular Queue Empty");
			return -1;
		}else{
			return array[FRONT];
		}
	}

	public void printQueue(){
		System.out.println("FRONT INDEX "+FRONT);

		for (int i = FRONT; i != REAR; i = (i + 1) % (SIZE)){
        	System.out.print(array[i] + " ");
		}
		System.out.print(array[REAR] + " ");
		System.out.println("\nREAR INDEX "+REAR);
		System.out.println();
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(6);
		//q.deQueue();
    	q.enQueue(10);
    	q.enQueue(20);
    	q.enQueue(30);
    	q.enQueue(40);
    	q.enQueue(50);
    	q.enQueue(60);
    	q.printQueue();

		q.deQueue();
    	q.printQueue();

		q.deQueue();
    	q.printQueue();

    	q.enQueue(70);
    	q.printQueue();
	}
}