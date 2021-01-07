package arrays;

public class RemoveJunkChar {

	public static void main(String[] args) {
		String Str= "dsfbdskfhderr2424324skjfh@#$%^&&^% hdfAAAabczZgkh45343434jdfj^&*) fhdsjfhd ";
		String Str1= "dsfbdskfhderr2424324skjfh@#$%^&&^% hdfAAAabczZgkh45343434jdfj^&*) fhdsjfhd ";
		String str3="Hi This is Ranganath white spaces removed here ";
		//Str= Str.toLowerCase();
		String newStr="";
		String newStr4="";
		System.out.println(Str);
		for (int i=0;i<Str.length();i++)
		{
			if(Str.charAt(i)>=97 && Str.charAt(i)<=122)
				newStr+=Str.charAt(i);
			else if(Str.charAt(i)>=65 && Str.charAt(i)<=90)
				newStr+=Str.charAt(i);
			else if(Str.charAt(i)>47 && Str.charAt(i)<=57)
				newStr+=Str.charAt(i);
			else
				System.out.println("Excluding: "+Str.charAt(i));
				
		}
		System.out.println(newStr);
		String newStr2=Str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newStr2);
		for (int i=0;i<str3.length();i++)
		{
			if (!(str3.charAt(i)==32))
			{
			  newStr4+=str3.charAt(i);
			}
		}
		//str3=str3.replaceAll(" ", "");
		//System.out.println(str3);
		System.out.println(newStr4);
				
	}
	
	
	

}
