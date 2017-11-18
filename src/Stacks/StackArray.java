package Stacks;

public class StackArray implements StackInterface {
	
	private int[] stack;
	private int top;
	
	public StackArray(int size){
		stack = new int[size];
		top = -1;
	}

	@Override
	public boolean isStackEmpty() {
		// TODO Auto-generated method stub
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean push(int d) {
		// TODO Auto-generated method stub
		if(top >= stack.length){
			System.out.println("Stack容量全滿！！");
			return false;
		}else{
			stack[++top] = d;
			return true;
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (isStackEmpty()){
			return -1;
		}else{
			return stack[top--];
		}
	}
}


