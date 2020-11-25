package InterviewQuestions;

import java.util.Scanner;

public class Int2Roman {

	public static void main(String[] args) {
		
		String[] units= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] tens= {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
		String[] hundreds= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] thousands= {"","M","MM","MMM"};
		System.out.println("Enter number to Convert to roman");
		int num=new Scanner(System.in).nextInt();
		
		
		System.out.println(thousands[(num/1000)]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[num%10]);
		
		
		

	}

}
