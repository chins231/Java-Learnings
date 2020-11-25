package InterviewQuestions;

public class StackClass {
	
	static char []stack; 
	static int top = -1; 
	static void push(char ele) 
	{ 
	    stack[++top] = ele; 
	} 
	  
	// pop function 
	static char pop() 
	{ 
	    return stack[top--]; 
	} 
	
	static char peek()
	{
		return stack[top];
	}

}
