package strings;

public class FirstnonRepeatingchar1 {

	public static void main(String[] args) {
		String str = "nonrepeatingcharo";
		for (int i=0;i<str.length();i++)
		{
			int first=str.indexOf(str.charAt(i));
			int last=str.lastIndexOf(str.charAt(i));
			if(first==last)
			{
				System.out.println(str.charAt(i));
				break;
			}
			
//			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
//				 System.out.println(str.charAt(i));
//			     break;
		}

	}

}
