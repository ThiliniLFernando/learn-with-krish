public class Stack{

	private int TOP = -1;
	private int[] array ;
	private int capacity;

	public Stack(int capacity){
		array = new int[capacity];
		this.capacity = capacity;
	}

	public int pop(){
		if(isEmpty()){
			System.out.println("STACK EMPTY");
			return -1;
		}else {
			int pop = this.array[this.TOP];
			this.array[this.TOP] = 0;
			--this.TOP;
			return pop;
		}
	}

	public boolean push(int val){
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated\n");
			return false;
		}else{
			this.array[++this.TOP] = val; 
			return true;
		}
	}

	public boolean isEmpty(){
		return this.TOP > -1 ;
	}

	public boolean isFull(){
		return this.TOP+1 == this.capacity ;
	}

	public void getStack(){
		for (int i : this.array) {
			System.out.print(i+" ");
		}
			System.out.println();
	}

	public static void main(String []args){
		Stack s = new Stack(10);
		s.push(1);
		s.push(10);
		s.push(100);
		s.getStack();
		s.pop();
		s.getStack();
		s.pop();
		s.getStack();
		s.pop();
		s.getStack();
		s.pop();
		s.getStack();
		s.push(1);
		s.push(10);
		s.push(100);
		s.push(1);
		s.push(10);
		s.push(100);
		s.push(1);
		s.push(10);
		s.push(100);
		s.push(1);
		s.push(10);
		s.push(100);
		s.getStack();
	}
}