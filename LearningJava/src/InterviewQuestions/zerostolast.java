package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zerostolast {

	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		 int arrSize=new Scanner (System.in).nextInt();
//		 ArrayList a = new ArrayList [];
//		 ArrayList[] b = new ArrayList [];
	  int []arr= new int[arrSize];
	  int []array2= new int[arrSize];
		  int []array3= new int[arrSize];
		  
		  int length=arr.length;
		  int count=0;
		for (int i=0;i<arrSize;i++)
		{
			System.out.println("Enter Array elements  (INteger Value):");
			
			arr[i]=new Scanner (System.in).nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println("Sorted array:"+ Arrays.toString(arr));
		//int length=arr.length;
        for (int i=0;i<=length;i++)
        {
            if(count==0)
            {
               array2[0]=arr[0];
            }
            else if(count%2==0)
            {
                int j=0;
               while (j<i)
               {
                   array2[j]=arr[j];
                   j++;
               }
               System.out.println(j);
               System.out.println(Arrays.toString(array2));
               
                  
                  int sum_middle=array2[(j)/2]+array2[((j)/2)-1];
                  System.out.println(sum_middle);
                  int median1 =(sum_middle)/2;
                  System.out.println(median1);
                  array2[count]=median1;
                  
                  System.out.println(Arrays.toString(array2));
                
            }
            else 
            {
                int j=0;
               while (j<i)
               {
                   array2[j]=arr[j];
                   j++;
                   
               }
               System.out.println(j);
               System.out.println(Arrays.toString(array2));
                int median1=array2[(j)/2];
                array2[count]=median1;
                System.out.println(Arrays.toString(array2));
         
            }
            count ++;
        }
		System.out.println(Arrays.toString(array2));
	}
}


