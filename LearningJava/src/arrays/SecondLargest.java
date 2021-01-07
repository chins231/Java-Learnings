package arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		 int temp, size;
	      int array[] = {8, 10, 5, 4, 3};
	      size = array.length;
 Arrays.sort(array);
//	      for(int i = 0; i<size; i++ ){
//	         for(int j = i+1; j<size; j++){
//
//	            if(array[i]>array[j]){
//	               temp = array[i];
//	               array[i] = array[j];
//	               array[j] = temp;
//	               System.out.println(Arrays.toString(array));
//	            }
//	         }
//	      }
	      System.out.println(Arrays.toString(array));
	      System.out.println("the second largest number is:: "+array[size-3]);

	}

}
