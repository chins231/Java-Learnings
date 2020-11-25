package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class commonelementsin3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5,6,7};
		int[] arr2= {10,20,30,6,7};
		int[] arr3= {100,200,7};
		Set<Integer> set1 = new HashSet<>(); 
		  
        // Iterate through the array 
        for (int t : arr1) { 
            // Add each element into the set 
            set1.add(t); 
        } 
        Set<Integer> set2 = new HashSet<>(); 
		  
        // Iterate through the array 
        for (int t : arr2) { 
            // Add each element into the set 
            set2.add(t); 
        } 
        Set<Integer> set3 = new HashSet<>(); 
		  
        // Iterate through the array 
        for (int t : arr3) { 
            // Add each element into the set 
            set3.add(t); 
        } 
		
        set1.retainAll(set2);
        System.out.println(set1);
        set1.retainAll(set3);
        System.out.println(set1);
        
		
		
		

	}

}
