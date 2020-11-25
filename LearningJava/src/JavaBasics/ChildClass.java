package JavaBasics;

public class ChildClass extends Parent{

	public static void main(String[] args) {
		Parent p=new ChildClass();
		
		p.m1();
		
		Parent p1=new Parent();
		
	   p1.m1();
	}
	public void m1()
	{
		System.out.println("Child M1");
	}

}
