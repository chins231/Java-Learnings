import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibanocciseries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8
		int first_val=0,second_val=1 ,num=10,num1=90;
		int val,temp;
		System.out.println(first_val);
		System.out.println(second_val);
//		if(first_val==num1||second_val==num1)
//			System.out.println("Value present");
//		
//	
//		for (int j=0;j<=num;j++)
//		{
//			val=first_val+second_val;
//			System.out.println(val);
//			first_val=second_val;
//			if(val==num1)
//			{
//				System.out.println("Value present ");
//				break;
//			}
//			second_val=val;
//			
//		}
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(first_val);
		list.add(second_val);
		
		
		for (int i=0;i<num;i++)
		{ 
			int temp1=second_val;
			second_val=first_val+second_val;
			first_val=temp1;
			
			list.add(second_val);
		}
		System.out.println(list);
		
		
		
		
		
		
		

	}

}
