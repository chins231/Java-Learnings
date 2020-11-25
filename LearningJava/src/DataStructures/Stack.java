package DataStructures;

public class Stack {
    int array[];
    int capacity;
    int top;
    Stack(int capacity)
    {
    	this.capacity=capacity;
    	this.array=new int[capacity];
    	this.top=-1;
    }
    public int push(int item)
    {
    	if (top<(capacity-1))
    	{
    	  array[++top]=item;
    	  return array[top];
    	}
    	else {
    		throw new RuntimeException("Stack is full , push not allowed");
    	}
    }
    public int pop()
    {
    	if (top!=-1)
    		return array[top--];
       	else {
       		throw new RuntimeException("Stack is already empty !!!");
       	}
    	
    }
    public int peek()
    {
    	return array[top];
    }
	public static void main(String[] args) {
		 Stack st =new Stack(5);
		 System.out.println(st.push(10));
		 System.out.println(st.push(10));
		 System.out.println(st.push(10));
		 System.out.println(st.push(10));
		 System.out.println(st.push(10));
		 System.out.println(st.push(10));
		 System.out.println(st.pop());
		 System.out.println(st.peek());
		 System.out.println(st.pop());
		 System.out.println(st.pop());
		 System.out.println(st.pop());
		 System.out.println(st.pop());
		 System.out.println(st.pop());
		 System.out.println(st.pop());
		
	}
}
