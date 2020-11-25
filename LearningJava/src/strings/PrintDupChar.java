package strings;

public class PrintDupChar {

	public static void main(String[] args) {
		String str="abcda";
		char[] ch= str.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			for (int j=i+1;j<ch.length-1;j++)
			{
				if (ch[i]==ch[j+1])
				{
					System.out.println(ch[i]);
					break;
				}
			}
			
		}

	}

}
