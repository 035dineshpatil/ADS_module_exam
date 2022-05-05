class Stack{
	int []ar;
	int size;
	int top1;
	int top2;
	
	Stack(int n)
	{
		size = n;
		top1 = n/2+1;
		top2 = n/2;
		ar = new int [n];
	}
	
	void push1 (int a){
		if (top1 >0)
		{
			top1--;
			ar[top1] = a;
		}
		else {
			System.out.println();
			return;
		}
	}
	void push2 (int a){
		if (top2 <size-1){
			top2++;
			ar [top2] = a;
		}
		else {
			System.out.println();
		}return;
		
	}
	int pop1(){
		if (top1<=size/2){
			int a = ar[top1];
			top1++;
			return a;
		}
		else {
			System.out.println();
		}return 0;
			
	}
	int pop2(){
		if (top2>=size/2+1){
			int a = ar[top2];
			//top2--;
			return a;
		}
		else {
			System.out.println();
		}return 0;
	}
	
	public static void main (String [] args){
		Stack s = new Stack(6);
		
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		
		
		System.out.println("poped element from Stack1 is "+s.pop1());
		
		s.push2(40);
		System.out.println("poped element from stack2 is "+ s.pop2());
	}
}