package strings;

public class StringRev_noInBuilt {

	public static void main(String[] args) {
		String str= "HelloCHinnu";
		String strrev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			strrev+=str.charAt(i);
		}
		System.out.println(strrev);

	}

	
	

}
