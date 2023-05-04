/**
 * AUTHOR : Thilini Fernando
 * 
 **/
public class Queue{
	private int FRONT,REAR = -1;
	private int SIZE = -1;
	private int[] array;

	public Queue(int size){
		this.SIZE = size;
		this.array = new int[size];
	}

	public boolean enQueue(int val){
		if (isFull()) {
			System.out.println("Queue OverFlow");
			return false;
		}else{
			if (FRONT == -1) {
				FRONT = 0;
			}
			array[++REAR] = val;
			return true;
		}
	}

	public int deQueue(){
		if(isEmpty()){
			System.out.println("QUEUE EMPTY");
			return -1;
		}else{
			int top = array[FRONT];
			if(FRONT >= REAR){
				FRONT = -1;
				REAR = -1;
			}else{
				FRONT++;
			}
			return top;
		}
	}

	public boolean isEmpty(){
		return REAR == -1;
	}

	public boolean isFull(){
		return REAR == SIZE -1 ;
	}

	public int peek(){
		if (isEmpty()) {
			System.out.println("QUEUE EMPTY");
			return -1;
		}else{
			return array[FRONT];
		}
	}

	public void printQueue(){
		for (int i = FRONT; i<= REAR; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue q = new Queue(6);
		q.deQueue();
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
	}
}