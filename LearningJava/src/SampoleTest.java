import java.util.HashSet;
import java.util.Set;

public class SampoleTest {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set1);
		System.out.println(set2);
		int n=6,val;
		for (int i: set1)
		{
			val=n-i;
			for(int j:set2)
			{
				if(val==j)
				{
					System.out.println(i+" "+" "+j);
			        break;	
				}
			}
			
		}
		
		

	}

}
