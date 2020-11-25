package strings;

public class StraingContainsNum {

	public static void main(String[] args) {
		String str="dhjfdkjfhdfhd";
		if(str.matches("[a-zA-Z]+"))
		{
			System.out.println("This string doesnt contains digit");
			
		}
		else
		{
			System.out.println("This string  contains digit");
		}

	}

}
