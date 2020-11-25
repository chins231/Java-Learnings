package strings;

public class Strrev {

	public static void main(String[] args) {
		String str="esrever";
		String strrev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			strrev+=str.charAt(i);
		}
		System.out.println(strrev);
		StringBuilder sbr=new StringBuilder(str);
		System.out.println(sbr.reverse());
		StringBuffer sbf=new StringBuffer(str);
		System.out.println(sbf.reverse());
		

	}

}
