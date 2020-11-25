package strings;

public class MultipleStrings {

	public static void main(String[] args) {
		String str = "testerste";
		StringBuilder sb =new StringBuilder(str);
		int n=10,count=0;
		long times=n/str.length();
		int remainder =(n%str.length());
		
//		for (int i=0;i<n;i++)
//		{
//			sb.append(str);
//		}
//		System.out.println(sb);
//		
//		for (int i=0;i<sb.length();i++)
//		{
//			if (sb.charAt(i)=='a')
//				count++;
//		}
		
		for (char ch : str.toCharArray())
		{
			if(ch=='a')
				count++;
		}
		count*=times;
		if (remainder==0)
		   System.out.println("Number of times a repeated in "+sb+" is: "+count);
		else
		{
			String remaining = str.substring(0,remainder);
			for (char ch : remaining.toCharArray())
			{
				if(ch=='a')
					count++;
			}
			
			System.out.println("Number of times a repeated in "+sb+" is: "+count);
		}
		

		

	}

}
