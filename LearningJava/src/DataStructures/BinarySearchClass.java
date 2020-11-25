package DataStructures;

public class BinarySearchClass {

	
		
		int BinarySearchClass(int a[], int left, int ryt, int num)
		{
			if (ryt>=1)
			{
				int mid =1+(ryt-1)/2;
				if (a[mid]==num)
					return mid;
				if (a[mid]<num)
					return BinarySearchClass(a,mid+1,ryt,num);
				else
					return BinarySearchClass(a,left,mid-1,num);
				
			}
			 return -1;
		}
	

}
