import java.util.Scanner;

public class Numbercheck {
	public static void main(String[] args) {
		int n,s,min=0,max=0,temp=0,count=0;
		System.out.println("Enter number of digits :");
		n=new Scanner(System.in).nextInt();
		System.out.println("Enter sum to find for :");
		s=new Scanner(System.in).nextInt();
		
		switch(n)
		{
		case 3:
			min=100;
			max=999;
			break;
		case 4:
			min=1000;
			max=9999;
			break;
		case 5:
			min=10000;
			max=99999;
			break;
		case 6:
			min=100000;
			max=999999;
			break;
		case 7:
			min=1000000;
			max=9999999;
			break;
		case 8:
			min=10000000;
			max=99999999;
			break;
		 default:
			min=100000000;
			max=999999999;
			break;
			
		}
		for (int i=min;i<=max;i++)
		{
			temp=0;
			int j=i;
			while(j>0)
			{
				
				temp+=j%10;
				j=j/10;
				if(temp>s)
					break;
			}
			
			if(temp==s)
			{
				System.out.println("Sum of digits for"+i+" equal to "+s);
				System.out.println("total"+temp);
				System.out.println("*************");
				count++;
			}
			
		}
		
		
		System.out.println(count);
	}


}
