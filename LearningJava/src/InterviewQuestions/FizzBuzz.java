package InterviewQuestions;

public class FizzBuzz {

	public static void main(String[] args) {
		int fizz=0,buzz=0,fizzbuzz=0;
		for (int i=1;i<=100;i++)
		{
			
			if(i%3==0 && i%5==0)
			{
			System.out.println("FizzBuzz");
			fizzbuzz++;
		
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
				buzz++;
			
			}
			 
			else if(i%3==0) {
				System.out.println("Fizz");
				fizz++;
			
			}
			 
			else
			{
				System.out.println(i);
			}
				
			
		}
		System.out.println("Total numbers divisible by 3 alone is "+fizz+" divisible by 5 alone is :"+buzz+" divisible by both 3 and 5 is "+fizzbuzz);

	}

}
